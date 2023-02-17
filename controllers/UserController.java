package seminar_05.controllers;

import java.util.List;

import seminar_05.model.User;
import seminar_05.model.Fields;
import seminar_05.model.Repository;
import seminar_05.utils.NotFoundException;
import seminar_05.utils.Validate;

public class UserController {
    private final Repository repository;
    private final Validate validate;

    public UserController(Repository repository, Validate validate) {
        this.repository = repository;
        this.validate = validate;
    }

    public void saveUser(User user, String reg) throws Exception {
        validate.checkNumber(user.getPhone());
        validate.checkName(user.getFirstName());
        validate.checkName(user.getLastName());
        repository.CreateUser(user, reg);
    }

    public void updateUser(User user, Fields field, String param) throws Exception {
        if (field == Fields.TELEPHONE) {
            validate.checkNumber(param);
        } else if (field == Fields.NAME) {
            validate.checkName(param);
        } else if (field == Fields.FIO) {
            validate.checkName(param);
        }
        repository.UpdateUser(user, field, param);

        throw new NotFoundException("Пользователь не найден");

    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new NotFoundException("Пользователь не найден");
    }

    public List<User> getUsers() throws Exception {
        return repository.getAllUsers();
    }

    /**
     * @param userId
     * @throws Exception
     */
    public void delUser(String userId) throws Exception {

        repository.deleteUser(userId);

        throw new NotFoundException("Пользователь не найден");
    }
}
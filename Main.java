package seminar_05;

import seminar_05.controllers.UserController;
import seminar_05.model.FileOperation;
import seminar_05.model.FileOperationImpl;
import seminar_05.model.Repository;
import seminar_05.model.RepositoryFile;
import seminar_05.utils.Validate;
import seminar_05.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
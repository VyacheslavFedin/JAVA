package HOMEWORK2;

import HOMEWORK2.controllers.UserController;
import HOMEWORK2.model.FileOperation;
import HOMEWORK2.model.FileOperationable;
import HOMEWORK2.model.Repository;
import HOMEWORK2.model.RepositoryFile;
import HOMEWORK2.utils.Validate;
import HOMEWORK2.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperationable fileOperation = new FileOperation("notes.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}

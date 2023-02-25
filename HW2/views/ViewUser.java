package HOMEWORK2.views;

import java.time.LocalDateTime;
import java.util.Scanner;

import HOMEWORK2.controllers.UserController;
import HOMEWORK2.model.Fields;
import HOMEWORK2.model.Note;
import HOMEWORK2.utils.NameException;
import HOMEWORK2.utils.NotFoundException;
import HOMEWORK2.utils.Validate;

public class ViewUser {
    private final UserController userController;
    private final Validate validate;

    public ViewUser(UserController userController, Validate validate) {
        this.userController = userController;
        this.validate = validate;
    }

    public void run() {
        Commands com = Commands.NONE;
        showHelp();
        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT)
                    return;
                switch (com) {
                    case CREATE:
                        create();
                        break;
                    case FIND:
                        find();
                        break;
                    case UPDATE:
                        update();
                        break;
                    case LIST:
                        list();
                        break;
                    case DELETE:
                        delete();
                        break;
                    case HELP:
                        showHelp();
                }
            } catch (Exception ex) {
                System.out.println("Произошла ошибка " + ex.toString());
            }
        }
    }

    private void find() throws Exception {
        String id = prompt("Идентификатор записки: ");
        Note notef = userController.readNote(id);
        System.out.println(notef);
    }

    private void update() throws Exception {
        String noteId = prompt("Идентификатор записки: ");
        String field = prompt("Какое поле (HEADER, CONTENT): ");
        String param = prompt("Введите значение, на которое хотите изменить: ");
        Note noteu = userController.readNote(noteId);
        userController.updateNote(noteu, Fields.valueOf(field.toUpperCase()), param);
    }


    public String catchNull(String msg) throws Exception {
        while (true) {
            try {
                String str = prompt(String.format("Введите %s (Отказ введите 0): ", msg));
                if (str.equals("0")) {
                    System.out.println("Вы отказались от ввода для изменения пользователя");
                    return null;
                }
                validate.checkField(str);
                return str;
            } catch (NameException ex) {
                System.out.println("Ошибка " + ex.toString());
            }
        }
    }

    private void list() throws Exception {
        for (Note note : userController.getNotes()) {
            System.out.println(note);
        }
    }

    private void delete() throws Exception {
        String noteid = prompt("Идентификатор записки: ");
        try {
            
            userController.delNote(noteid);
        } catch (NotFoundException ex) {
            System.out.println("Ошибка " + ex.toString());
        }

    }

    private void create() throws Exception {
        String header = catchNull("Заголовок: ");
        String content = catchNull("Содержание: ");
        String date = LocalDateTime.now().toString();
        userController.saveNote((new Note(header, content, date)));
    }

    private void showHelp() {
        System.out.println("Список команд:");
        for (Commands c : Commands.values()) {
            System.out.println(c);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

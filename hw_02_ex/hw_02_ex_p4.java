// Разработайте программу, которая выбросит Exception, 
// когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, 
// что пустые строки вводить нельзя.

import java.util.Scanner;

public class hw_02_ex_p4 {
    private static boolean chek;

    public static void main(String[] args) {

        while (chek == false) {
            chek = true;

            Scanner in = new Scanner(System.in);
            System.out.println("введите строку : ");

            String string = in.nextLine();

            if (string.isEmpty()) {
                System.out.println("строка пустая, повторите ввод");
                chek = false;
            }
            System.out.println(string);

        }
    }
}

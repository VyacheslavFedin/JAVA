// Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
// (типа float), и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw_02_ex_p1 {
    private static boolean chek;

    public static void main(String[] args) {

        
        
        while (chek == false) {
            chek= true;
             try {
            Scanner in = new Scanner(System.in);
            System.out.print("введите число (типа float) : ");
            float num = in.nextFloat();

            System.out.print("Ваше число : " + num);
            in.close();
             }catch (InputMismatchException ex){
                System.out.println("неверный ввод данных");
                chek = false;
             }
        }
    }
}

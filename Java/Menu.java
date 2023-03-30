import java.util.Scanner;

public class Menu {

    public static int chekWord;
    public static int chekWord2;
    public static int chance;

    public static int Menus() {
              
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.разыграть приз");
        System.out.println("2.изменить шанс выйгрыша игрушки");
        System.out.println("3.добавить игрушку");
        System.out.println("4.выход");

        chekWord = scanner.nextInt();
        return chekWord;
    
    } 

    public static int Menus2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите id игрушки");
        chekWord2 = scanner.nextInt();
        return chekWord2;
    }

    public static int Menus3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите новый шанс выйгрыша 1-100");
        chance = scanner.nextInt();
        return chance;
    }
        
}

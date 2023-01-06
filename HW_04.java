import java.util.LinkedList;
import java.util.Scanner;

public class HW_04 {
    public static void main(String[] args) {

        // 1.Вывести список на экран в перевернутом виде (без массивов)
        // Пример:
        // 1->2->3->4
        // Вывод:
        // 4->3->2->1
        {
            LinkedList<Integer> intLinList = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                intLinList.addFirst(scanner.nextInt());
            }
            scanner.close();
            System.out.println(intLinList);
        }

        // ______________________________________________________________________________________
        // 2. Определить является ли список знакочередующимся? (без массивов)
        {
            LinkedList<Integer> intLinList = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                intLinList.add(scanner.nextInt());
            }
            scanner.close();
            for (int i = 0; i < n - 1; i++) {
                if (intLinList.get(i) * intLinList.get(i + 1) > 0) {
                    System.out.print("не ");
                    break;
                }
            }
            System.out.println("знакочередующийся список");
        }
    }
}

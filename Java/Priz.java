import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Priz {
    static String player;
    static String[] arrPriz = new String[20];

    public static void Priz() throws IOException {
        arrPriz[0] = ">";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        FileWriter writer = new FileWriter("data.txt");

        System.out.println("введите имя игрока : ");
        player = scanner.nextLine();
        System.out.println(" наименование призов :");

        for (Toys Toys : Main.listToys) {
            if (Toys.getWeight() < random.nextInt(100)) {
                System.out.println(Toys.getName());
                Toys.setQuantity(Toys.getQuantity()-1);

            }
        }

        
        //System.out.println(arrPriz);
        System.out.println("остаток игрушек на складе :");
        for (Toys Toys : Main.listToys) {
            String name = Toys.getName();
            int id = Toys.getId();
            int weight = Toys.getWeight();
            int quantity = Toys.getQuantity();
            writer.write(name + " " + id + " " + weight + " " + quantity + System.getProperty("line.separator"));
        }
        writer.close();
        System.out.println(Main.listToys);

    }
}

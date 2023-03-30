import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AddToy {
    public static String name2;
    public static int id2,weight2,quantity2;

    static void AddToys() throws IOException{

        Scanner scanner = new Scanner(System.in);

        System.out.println("введите имя игрушки : ");
        name2 = scanner.nextLine();
        System.out.println("введите id игрушки : ");
        id2=scanner.nextInt();
        System.out.println("введите вес игрушки : ");
        weight2=scanner.nextInt();
        System.out.println("введите количество игрушек : ");
        quantity2=scanner.nextInt();
        
        Main.listToys.add(new Toys(name2,id2,weight2,quantity2));

        FileWriter writer = new FileWriter("data.txt");

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

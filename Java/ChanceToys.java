import java.io.FileWriter;
import java.io.IOException;

public class ChanceToys {
    
    public static void ChToys() throws IOException {

        FileWriter writer = new FileWriter("data.txt");

        for (Toys Toys : Main.listToys) {
            if (Toys.getId() == Menu.chekWord2) {
                Toys.setWeight(Menu.chance);

            }
        }
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
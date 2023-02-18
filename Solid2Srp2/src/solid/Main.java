package solid;

import solid.srp.models.Input;
import solid.srp.models.Order;
import solid.srp.models.SaveToFile;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Input().inputFromConsole();
        SaveToFile save = new SaveToFile("order.json");

        save.save(order);
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Задание 2

// Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.
// Стараемся применять ООП и работу с файлами.
// Если какой-то пункт не изучали и не знаете, как сделать, то можете сделать своим способом. 
// Например, у кого в курсе не было ООП, то применяем списки\массивы\словари

// Желательный функционал программы:
// В программе должен быть минимум один класс со следующими свойствами:
// id игрушки,
// текстовое название,
// количество
// частота выпадения игрушки (вес в % от 100)

// Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки)
// Возможность организовать розыгрыш игрушек.

// Например, следующим образом:
// С помощью метода выбора призовой игрушки – 
// мы получаем эту призовую игрушку и записываем в список\массив.
// Это список призовых игрушек, которые ожидают выдачи.
// Еще у нас должен быть метод – получения призовой игрушки.
// После его вызова – мы удаляем из списка\массива первую игрушку и сдвигаем массив. 
// А эту игрушку записываем в текстовый файл.
// Не забываем уменьшить количество игрушек

public class Main {

    public static List<Toys> listToys = new ArrayList<>();
    public static int chekWord2;
    public static int chance;

    public static void main(String[] args) throws IOException {

        Toys toys1 = new Toys("медведь", 111, 25, 100);
        Toys toys2 = new Toys("заяц", 222, 15, 100);
        Toys toys3 = new Toys("волк", 333, 10, 100);
        Toys toys4 = new Toys("лиса", 444, 30, 100);
        Toys toys5 = new Toys("кабан", 555, 20, 100);

        // List<Toys> listToys = new ArrayList<>();
        listToys.add(toys1);
        listToys.add(toys2);
        listToys.add(toys3);
        listToys.add(toys4);
        listToys.add(toys5);

        System.out.println(listToys);

        FileWriter writer = new FileWriter("data.txt");

        for (Toys Toys : listToys) {
            String name = Toys.getName();
            int id = Toys.getId();
            int weight = Toys.getWeight();
            int quantity = Toys.getQuantity();
            writer.write(name + " " + id + " " + weight + " " + quantity + System.getProperty("line.separator"));
        }
        writer.close();

        while (Menu.chekWord != 4) {
            Menu.Menus();

            if (Menu.chekWord == 1) {
                System.out.println("розыгрыш приза");
                Priz.Priz();
            }

            if (Menu.chekWord == 2) {
                Menu.Menus2();
                Menu.Menus3();
                ChanceToys.ChToys();

            }
            if (Menu.chekWord == 3) {
                AddToy.AddToys();
            }

            if (Menu.chekWord == 4) {
                System.out.println("stop");
                break;
            }

        }
    }
}

import java.util.*;

public class HW_05 {
    public static void main(String[] args) {

        // 1) Подсчитать количество вхождения каждого слова
        // Пример:
        // Россия идет впереди всей планеты. Планета — это не Россия.
        // toLowerCase();
        {
            Map<String, Integer> map = new HashMap<>();
            String str = "Россия идет впереди всей планеты. Планета — это не Россия.";

            str = str.toLowerCase();

            String[] strArr = str.split("[ .—]+");

            for (int i = 0; i < strArr.length; i++) {
                map.putIfAbsent(strArr[i], 0);
                map.put(strArr[i], map.get(strArr[i]) + 1);
            }
            for (var entry : map.entrySet()) {
                System.out.println(entry.getKey() + " , встретилось : " +
                        entry.getValue());
            }
        }
        // _______________________________________________________________________
        // 2) Подсчитать количество искомого слова,
        // через map (наполнением значение, где искомое слово будет являться ключом)

        {
            Map<String, Integer> map = new HashMap<>();
            String str = "qwe rrfkjf fhbvub qwe, qwe - qwe";

            // str = str.toLowerCase();
            String[] strArr = str.split("[, .—-]+");

            Scanner scanner = new Scanner(System.in);
            System.out.println("введите слово: ");
            String chekWord;
            chekWord = scanner.nextLine();
            scanner.close();

            for (int i = 0; i < strArr.length; i++) {
                map.putIfAbsent(strArr[i], 0);
                map.put(strArr[i], map.get(strArr[i]) + 1);
            }
            System.out.println(map.get(chekWord));
        }
        // _______________________________________________________________________
        // 3) Найти пересечения слов в массивах и указать их общее количество.
        // Пример:
        // mas1= [“qwe”,”asd”,”qwe”,”x”]
        // mas2=[“qwe”,”v”]
        // Результат:
        // qwe=3
        {

            String[] mas1 = new String[] { "qwe", "asd", "qwe", "x" };
            String[] mas2 = new String[] { "qwe", "v", "x" };

            Set<String> set1 = new HashSet<>();
            for (int i = 0; i < mas1.length; i++) {
                set1.add(mas1[i]);
            }

            int chek1 = 0;
            for (int i = 0; i < mas2.length; i++) {
                if (set1.contains(mas2[i])) {
                    System.out.println("значение: " + mas2[i]);
                    chek1++;
                    set1.remove(mas2[i]);
                }
            }
            System.out.println("=" + chek1);
        }
    }
}

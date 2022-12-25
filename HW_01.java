// +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

import java.io.*;

public class HW_01 {
    public static void main(String[] args) throws Exception {

        // чтение из файла

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String lines_file[] = new String[2];

        for (int i = 0; i <= 1; i++) {
            lines_file[i] = br.readLine();
            // System.out.printf("%s\n", lines_file[i]);
        }
        br.close();

        // перевод строк в числа и определение знака чисел
        
        String[] line_0 = lines_file[0].split("\\D+");
        String[] line_1 = lines_file[1].split("\\D+");
        int b = Integer.parseInt(String.join("", line_0));
        int a = Integer.parseInt(String.join("", line_1));

        if (lines_file[0].contains("-")) {
            b = b * (-1);
        }
        if (lines_file[1].contains("-")) {
            a = a * (-1);
        }

        // возведение в степень

        double a1 = 1;
        int b1 = b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        if (a != 0 & b != 0) {

            if (b1 < 0)
                b1 = b1 * (-1);
            for (int i = 1; i <= b1; i++) {
                a1 = a1 * a;
            }
            if (b < 0)
                a1 = 1 / a1;
            System.out.println("ответ = " + a1);

        } else {
            System.out.println("ответ: не определено");
        }

        // запись в файл

        String a2 = Double.toString(a1);
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.write(a2);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
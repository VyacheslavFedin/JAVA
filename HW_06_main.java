package org.example;


import ch.qos.logback.core.net.SyslogOutputStream;
import org.example.model.Notebook;

import java.util.*;

//   Задание:
// • Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
//   Реализовать в java.
// • Создать множество ноутбуков.
// • Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//   отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//   “Введите цифру, соответствующую необходимому критерию:
//   1 - ОЗУ
//   2 - Объем ЖД
//   3 - Операционная система
//   4 - Цвет …
// • Далее нужно запросить минимальные значения для указанных критериев
//   - сохранить параметры фильтрации можно также в Map.
// • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class HW_06_main {
    public static void main(String[] args) {

        Notebook n1 = new Notebook("эвм №1", 8, 300, "Windows", "black");
        Notebook n2 = new Notebook("эвм №2", 16, 600, "Windows", "black");
        Notebook n3 = new Notebook("эвм №3", 16, 600, "Linux", "red");
        Notebook n4 = new Notebook("эвм №4", 32, 1200, "Windows", "white");
        Notebook n5 = new Notebook("эвм №5", 32, 1200, "Linux", "white");

        List<Notebook> listNotebook = new ArrayList<>();
        listNotebook.add(n1);
        listNotebook.add(n2);
        listNotebook.add(n3);
        listNotebook.add(n4);
        listNotebook.add(n5);
        Map<Integer, String> map_name_nb = new LinkedHashMap<>();
        map_name_nb.put(1, "эвм №1");
        map_name_nb.put(2, "эвм №2");
        map_name_nb.put(3, "эвм №3");
        map_name_nb.put(4, "эвм №4");
        map_name_nb.put(5, "эвм №5");
        Map<Integer, Integer> map_mem = new LinkedHashMap<>();
        map_mem.put(1, 8);
        map_mem.put(2, 16);
        map_mem.put(3, 32);
        Map<Integer, Integer> map_hdd = new LinkedHashMap<>();
        map_hdd.put(1, 300);
        map_hdd.put(2, 600);
        map_hdd.put(3, 1200);
        Map<Integer, String> map_os = new LinkedHashMap<>();
        map_os.put(1, "Windows");
        map_os.put(2, "Linux");
        Map<Integer, String> map_color = new LinkedHashMap<>();
        map_color.put(1, "black");
        map_color.put(2, "red");
        map_color.put(3, "white");

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1-выберите название ноутбука");
        System.out.println("2-объем памяти");
        System.out.println("3-объем диска");
        System.out.println("4-операционная система");
        System.out.println("5-цвет");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("выберите название ноутбука");
            System.out.println("1 - №1");
            System.out.println("2 - №2");
            System.out.println("3 - №3");
            System.out.println("4 - №4");
            System.out.println("5 - №5");
            Scanner scanner2 = new Scanner(System.in);
            int number2 = scanner.nextInt();
            for (int i = 0; i < listNotebook.size(); i++) {
                Notebook notebookTemp = listNotebook.get(i);
                if (notebookTemp.getName_nb() == map_name_nb.get(number2)) {
                    System.out.println(listNotebook.get(i));
                }
            }
        } else {
            if (number == 2) {
                System.out.println("выберите объем памяти");
                System.out.println("1 - 8Гб");
                System.out.println("2 - 16Гб");
                System.out.println("3 - 32Гб");
                Scanner scanner2 = new Scanner(System.in);
                int number2 = scanner.nextInt();
                for (int i = 0; i < listNotebook.size(); i++) {
                    Notebook notebookTemp = listNotebook.get(i);
                    if (notebookTemp.getMem() == map_mem.get(number2)) {
                        System.out.println(listNotebook.get(i));
                    }
                }
            } else {
                if (number == 3) {
                    System.out.println("выберите объем диска");
                    System.out.println("1 - 300Гб");
                    System.out.println("2 - 600Гб");
                    System.out.println("3 - 1200Гб");
                    Scanner scanner2 = new Scanner(System.in);
                    int number2 = scanner.nextInt();
                    for (int i = 0; i < listNotebook.size(); i++) {
                        Notebook notebookTemp = listNotebook.get(i);
                        if (notebookTemp.getHdd() == map_hdd.get(number2)) {
                            System.out.println(listNotebook.get(i));
                        }
                    }
                } else {
                    if (number == 4) {
                        System.out.println("выберите операционную систему");
                        System.out.println("1 - Windows");
                        System.out.println("2 - Linux");
                        Scanner scanner2 = new Scanner(System.in);
                        int number2 = scanner.nextInt();
                        for (int i = 0; i < listNotebook.size(); i++) {
                            Notebook notebookTemp = listNotebook.get(i);
                            if (notebookTemp.getOs() == map_os.get(number2)) {
                                System.out.println(listNotebook.get(i));
                            }
                        }
                    } else {
                        if (number == 5) {
                            System.out.println("выберите цвет");
                            System.out.println("1 - черный");
                            System.out.println("2 - красный");
                            System.out.println("3 - белый");
                            Scanner scanner2 = new Scanner(System.in);
                            int number2 = scanner.nextInt();
                            for (int i = 0; i < listNotebook.size(); i++) {
                                Notebook notebookTemp = listNotebook.get(i);
                                if (notebookTemp.getColor() == map_color.get(number2)) {
                                    System.out.println(listNotebook.get(i));
                                }
                            }
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
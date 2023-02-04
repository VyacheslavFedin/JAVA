//package Seminar_2;

public class main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Vasya", 1, "gray"))
        .addAnimal(new Horse("Ignat", 10))
        .addAnimal(new Duck("Donald", 5))
        .addAnimal(new Pingvin("Egorka",3));

        for (Animal an: zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.say());
        }

        System.out.println("Sound of the zoo");

        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.say());
        }

        for (Runable runner : zoo1.getRunner()) {
            System.out.println("Speed is : " + runner.speedOfRun());
        }

        int max = zoo1.getChampionOfRunners();
        System.out.println(String.format("Max of speed in the zoo is %d", max));

        System.out.println("-------");
        for (Flyable flyer : zoo1.getFlyers()) {
            System.out.printf("Speed of fly : %d", flyer.speedOfFly());
        }
        System.out.println();
        System.out.println("-------водоплавающие : ");
        for (Swimable swimer : zoo1.getSwimmers()) {
            System.out.printf("Speed of swim : %d", swimer.speedOfSwim());
        }

    }
}
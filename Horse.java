//package Seminar_2;

public class Horse extends Animal implements Runable{

    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Игого";
    }

    @Override
    public String toString() {
        return "Horse " + super.toString();
    }

    @Override
    public int speedOfRun() {
        return 60;
    }
}
//package seminar_02;

public class Duck extends Animal implements Runable, Flyable{

    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Кря-кря";
    }

    @Override
    public int speedOfFly() {
        return 40;
    }

    @Override
    public int speedOfRun() {
        return 10;
    }

    
}
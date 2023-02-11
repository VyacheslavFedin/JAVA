public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Sword sword, RoundShield shield) {
        super(name, healthPoint, sword, shield);
    }

    @Override
    public String toString() {
        return "Swordman " + super.toString();
    }

    public int gethealthPointsDef() {
        return ((RoundShield) getShield()).gethealthPointsDef();
    }

}
public class Archer extends Warrior {

    /**
     * @param name
     * @param healthPoint
     * @param bow
     */
    public Archer(String name, int healthPoint, Bow bow, TowerShield shield) {
        super(name, healthPoint, bow, shield);
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }

    public int shotRange() {
        return ((Bow) getWeapon()).getRange();
    }

    public int gethealthPointsDef() {
        return ((TowerShield) getShield()).gethealthPointsDef();
    }
}
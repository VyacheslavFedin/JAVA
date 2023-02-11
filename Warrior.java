public abstract class Warrior {
    private String name;
    private int healthPoint;
    private Weaponable weapon;
    private Shieldable shield;

    public Warrior(String name, int healthPoint, Weaponable weapon, Shieldable shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Weaponable getWeapon() {
        return weapon;
    }

    public Shieldable getShield() {
        return shield;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return String.format("Warrior: %s, health: %d, weapon: %s shield: %s", name, healthPoint,
                weapon.toString(), shield.toString());
    }

    // public int getCountOfSafe(){
    // return getShield().getCountUpForHealth();
    // }

}
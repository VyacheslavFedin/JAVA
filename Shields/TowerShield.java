import java.util.Random;

public class TowerShield extends Shield {

    public TowerShield(int healthPointsDef) {
        super(healthPointsDef);
    }

    @Override
    public int shieldDef() {
        return new Random().nextInt(0, healthPointsDef);
    }

    public int gethealthPointsDef() {
        return healthPointsDef;
    }

    @Override
    public String toString() {
        return String.format("Tower Shield def: %d", healthPointsDef);
    }

}
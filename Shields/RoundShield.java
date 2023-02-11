import java.util.Random;

public class RoundShield extends Shield{

    public RoundShield(int healthPointsDef) {
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
        return String.format("Round Shield def: %d", healthPointsDef);
    }
}
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<E extends Warrior> implements Iterable<E> {
    private List<E> team = new ArrayList<>();

    public Team<E> addWarrior(E person) {
        team.add(person);
        return this;
    }

    @Override
    public Iterator<E> iterator() {
        return team.iterator();
    }

    public int maxTeamRange() {
        int maxRange = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if (((Archer) item).shotRange() > maxRange) {
                    maxRange = ((Archer) item).shotRange();
                }
            }
        }
        ;
        System.out.println("Max team range is : ");
        return maxRange;
    }

    public int maxTeamSafe() {
        int maxSave = 0;
        for (E item : team) {
            if (item instanceof Archer) {
                if (((Archer) item).gethealthPointsDef() > maxSave) {
                    maxSave = ((Archer) item).gethealthPointsDef();
                }
            } else if (item instanceof Swordman) {
                if (((Swordman) item).gethealthPointsDef() > maxSave) {
                    maxSave = ((Swordman) item).gethealthPointsDef();
                }
            }
        }
        ;
        System.out.println("Max team range is : ");
        return maxSave;
    }
}
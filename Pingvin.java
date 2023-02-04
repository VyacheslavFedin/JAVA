public class Pingvin extends Animal implements Swimable{

    public Pingvin(String name, int box) {
        super(name, box);
       
    }

    @Override
    public int speedOfSwim() {
       
        return 15;
    }

    @Override
    public String say() {
       
        return "А-а-А-ррр";
    }
    
}

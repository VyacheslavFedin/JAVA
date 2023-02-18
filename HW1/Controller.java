public class Controller{
    private Persister persister;

    public Controller(Persister persister) {
        this.persister = persister;
    }


    public void save(){
		persister.save();
        persister.report();
	}
    
}

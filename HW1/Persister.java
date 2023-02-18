public class Persister implements Reportable{
	private User user;
	
	public Persister(User user){
		this.user = user;
	}

	public void save (){
		System.out.println("Save is done");
	}
	
    @Override
    public void report() {
        System.out.println("Save user: " + user.getName());
        
    }
}
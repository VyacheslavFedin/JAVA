
public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		user.report();
		Controller controller = new Controller(new Persister(user));
		controller.save();
	}
}
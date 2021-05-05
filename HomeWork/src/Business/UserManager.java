package Business;
import Model.User;

public class UserManager {

	  public User addUsers(int id, String firstName, String lastName) {
		  	User course = new User(id,firstName,lastName);
	        return course;
	    }

	    public void listUsers(User[] Users) {
	        for (User user : Users) {
	            System.out.println(user);
	        }
	    }
}

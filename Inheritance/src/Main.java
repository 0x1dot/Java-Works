import Business.InstructorManager;
import Business.StudentManager;
import Business.UserManager;
import Model.Instructor;
import Model.Student;
import Model.User;

public class Main {

	public static void main(String[] args) {
		// USER
		User user = new User("Murat", "Dursun", "muratdursun@gmail.com", "0x1dot", "123");

		// INSTRUCTOR
		Instructor instructor = new Instructor("Engin", "Demiroğ", "engindemirog@gmail.com", "engindemirog", "1234",
				20);

		// STUDENT -- Teşekkürler
		Student student = new Student("Can", "Erdoğan", "ibrahim4545erdogan@gmail.com", "ican", "12345",
				"Balıkesir Üniversitesi", "Endüstri Mühendisliği");

		// USER MANAGER
		UserManager userManager = new UserManager();

		userManager.addUser(user);
		userManager.signIn(user);
		userManager.signOut(user);
		userManager.changeEmail(user, "deneme@gmail.com");
		userManager.changePassword(user, "deneme");
		userManager.changeUsername(user, "icaner");
		userManager.getInformation(user);
		userManager.removeUser(user);

		// INSTRUCTOR MANAGER
		InstructorManager instructorManager = new InstructorManager();

		instructorManager.addUser(instructor);
		instructorManager.getInformation(instructor);
		instructorManager.removeUser(instructor);

		// STUDENT MANAGER
		StudentManager studentManager = new StudentManager();

		studentManager.addUser(student);
		studentManager.getInformation(student);
		studentManager.removeUser(student);

	}
}
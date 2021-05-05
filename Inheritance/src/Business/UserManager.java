package Business;

import java.util.Scanner;

import Model.User;

public class UserManager {

	Scanner scanner = new Scanner(System.in);

	// SIGN IN
	public void signIn(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Hesab�n�za Ba�ar�yla Giri� Yap�ld�");

	}

	// SIGN OUT
	public void signOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Hesab�n�zdan ��k�� Yap�ld�");
	}

	// REGISTER
	public void addUser(User u) {

		User user = new User(u.getFirstName(), u.getLastName(), u.getEmail(), u.getUsername(), u.getPassword());
		u.users.add(user);
		System.out.println("Kullan�c� Olu�turuldu");
	}

	// DELETE ACCOUNT
	public void removeUser(User u) {
		String username = u.getUsername();

		for (int i = 0; i < u.users.size(); i++) {
			if (u.users.get(i).getUsername().equals(username)) {
				System.out.println("Kullan�c� Ad�n�z� De�i�tirmek i�in �ifrenizi Giriniz: ");
				String password = scanner.nextLine();

				if (password.equals(u.users.get(i).getPassword())) {
					u.users.remove(i);
					System.out.println("Kullan�c� Silindi");
				} else {
					System.out.println("Yanl�� �ifre Girdiniz. ��leminiz Ger�ekle�tirilemedi.");
				}
			} else {
				System.out.println("B�yle bir kullan�c� bulunamad�.");
			}
		}
	}

	// CHANGE EMAIL
	public void changeEmail(User user, String newEmail) {
		System.out.println("De�i�tirmek �stedi�iniz Mail: " + user.getEmail());
		System.out.println("Yeni Mail Adresiniz: " + newEmail);

		user.setEmail(newEmail);

		System.out.println("Mail Adresiniz Ba�ar�yla De�i�tirildi");
	}

	// CHANGE PASSWORD
	public void changePassword(User user, String newPassword) {

		System.out.println("�ifrenizi de�i�tirmek istiyor musunuz? (E/H)");
		String chose = scanner.nextLine();

		if (chose.equals("E")) {
			user.setPassword(newPassword);
			System.out.println("�ifreniz Ba�ar�yla De�i�tirildi");
		} else if (chose.equals("H")) {
			System.out.println("�ifre de�i�ikli�i onaylanmad�. �ifre de�i�imi yap�lamad�.");
		}

	}

	// CHANGE USERNAME
	public void changeUsername(User user, String newUsername) {
		System.out.println("De�i�tirmek �stedi�iniz Kullan�c� Ad�n�z: " + user.getUsername());
		System.out.println("Yeni Kullan�c� Ad�n�z: " + newUsername);

		user.setUsername(newUsername);

		System.out.println("Kullan�c� Ad�n�z� Ba�ar�yla De�i�tirildi");
	}

	// GET INFORMATION
	public void getInformation(User user) {
		System.out.println("Kullan�c�n�n Ger�ek Ad�: " + user.getFirstName() + " " + user.getLastName());
		System.out.println("�leti�im: " + user.getEmail());
		System.out.println("Kullan�c� Ad�: " + user.getUsername());
	}
}

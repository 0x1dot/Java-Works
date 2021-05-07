package WorkBackend.core.business;

import GAuthManager.GoogleAuthManager;
import WorkBackend.entities.concretes.User;

public class GoogleAuthAdapter implements AuthService {

	@Override
	public void register(User user) {
		GoogleAuthManager google = new GoogleAuthManager();
		 google.GoogleLoginVerification(user.getEmail(),user.getPassword());
		 System.out.println("Google ile başarıyla kayıt yapıldı.");
	}

	@Override
	public void login(User user) {
		GoogleAuthManager google = new GoogleAuthManager();
		 google.GoogleRegisterVerification(user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword());
		 System.out.println("Google ile başarıyla giriş yapıldı.");
	}

}

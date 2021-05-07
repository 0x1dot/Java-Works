import GAuthManager.GoogleAuthManager;
import WorkBackend.business.abstracts.UserService;
import WorkBackend.business.concretes.AuthManager;
import WorkBackend.business.concretes.MailManager;
import WorkBackend.business.concretes.UserManager;
import WorkBackend.business.concretes.UserValidationManager;
import WorkBackend.core.business.AuthService;
import WorkBackend.core.business.GoogleAuthAdapter;
import WorkBackend.dataAccess.concretes.HibernateUserDao;
import WorkBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new HibernateUserDao());
		AuthService authManager = new AuthManager(userService, new UserValidationManager(), new MailManager());
		System.out.println("----------------Kayıt ol----------------");
		authManager.register(new User(1, "Murat", "Dursun", "0x1dot@mail.com", "123456"));
		System.out.println("----------------Doğrulama----------------");
		userService.verifyUser(1, "TXVyYXQweDFkb3RAbWFpbC5jb20=");
		System.out.println("----------------Giriş----------------");
		authManager.login(new User(1, "Murat", "Dursun", "0x1dot@mail.com", "123456"));
		System.out.println("----------------Hatalı----------------");
		System.out.println("----------------Kayıt Ol----------------");
		authManager.register(new User(2, "Engin", "Demiroğ", "", "123456"));
		System.out.println("----------------Doğrulama yapılmadı----------------");
		authManager.register(new User(2, "Engin", "Demiroğ", "mail@mail.com", "123456"));
		System.out.println("----------------Giriş----------------");
		authManager.login(new User(2, "Engin", "Demiroğ", "mail@mail.com", "123456"));
		System.out.println("--------------------------------");
		authManager.login(new User(3, "0x1dot", "0x1dot", "0x1dot@0x1dot.com", "123456"));
		System.out.println("----------------Google----------------");
		AuthService googleAuthService = new GoogleAuthAdapter();
		googleAuthService.register(new User(1, "Murat", "Dursun", "0x1dot@mail.com", "123456"));
		googleAuthService.login(new User(1, "Murat", "Dursun", "0x1dot@mail.com", "123456"));
	}
}

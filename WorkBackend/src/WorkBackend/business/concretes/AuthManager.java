package WorkBackend.business.concretes;

import WorkBackend.business.abstracts.UserMailVerificationService;
import WorkBackend.business.abstracts.UserService;
import WorkBackend.business.abstracts.UserValidationService;
import WorkBackend.core.business.AuthService;
import WorkBackend.core.business.ValidationRules;
import WorkBackend.entities.concretes.User;

public class AuthManager implements AuthService {
	UserService userService;
	UserValidationService userValidationService;
	UserMailVerificationService userMailVerificationService;

	public AuthManager(UserService userService, UserValidationService userValidationService,
			UserMailVerificationService userVerificationService) {
		this.userService = userService;
		this.userValidationService = userValidationService;
		this.userMailVerificationService = userVerificationService;
	}

	@Override
	public void register(User user) {
		if (!userValidationService.validate(user)) {
			System.out.println("Lütfen tüm alanları doldurduğunuzdan emin olun!");
			return;
		}
		if (ValidationRules.run(checkIfUserExists(user))) {
			System.out.println("Kayıt olma işlemi başarıssz. Bu email ile bir başka üye mevcut.");
			return;
		}
		System.out.println("Kayut başarılı, üyeliğinizi doğrulamak için e-posta adresinizi kontrol ediniz.");
		userMailVerificationService.sendMail(user);
		userService.add(user);
	}

	@Override
	public void login(User user) {
		if (!ValidationRules.run(checkIfAllFieldsFilled(user.getEmail(), user.getPassword()))) {
			System.out.println("Giriş başarısız. Lütfen alanları düzgün doldurduğunuzdan emin olun.");
			return;
		}
		User checkLogin = userService.getByEmailAndPassword(user);

		if (checkLogin == null) {
			System.out.println("Giriş başarısız. E-posta adresiniz veya şifreniz yanlış.");
			return;
		}
		if (!checkIfUserVerified(checkLogin)) {
			System.out.println("Giriş başarısız. üyeliğinizi doğrulamadınız.");
			return;
		}
		System.out
				.println("Giriş başarılı. Hoşgeldiniz : " + checkLogin.getFirstName() + " " + checkLogin.getLastName());
	}

	private boolean checkIfUserExists(User user) {
		return userService.getByEmail(user);
	}

	private boolean checkIfUserVerified(User user) {
		return user.isVerified();
	}

	private boolean checkIfAllFieldsFilled(String email, String password) {
		if (email.length() == 0 || password.length() == 0) {
			return false;
		}
		return true;
	}
}
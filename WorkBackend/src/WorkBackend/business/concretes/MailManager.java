package WorkBackend.business.concretes;

import java.util.Base64;

import WorkBackend.business.abstracts.UserMailVerificationService;
import WorkBackend.entities.concretes.User;

public class MailManager implements UserMailVerificationService {

	@Override
	public void sendMail(User user) {
		System.out.println(user.getEmail() + " adresine gönderildi. google.com/auth?"
				+ Base64.getEncoder().encodeToString((user.getFirstName() + user.getEmail()).getBytes())
				+ " adresine gidiniz.");
	}

}

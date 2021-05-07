package WorkBackend.business.abstracts;

import WorkBackend.entities.concretes.User;

public interface UserMailVerificationService {
	void sendMail(User user);
}

package WorkBackend.business.abstracts;

import WorkBackend.entities.concretes.User;

public interface UserValidationService {
	boolean validate(User user);
}

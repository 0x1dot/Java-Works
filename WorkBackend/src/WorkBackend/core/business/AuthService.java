package WorkBackend.core.business;

import WorkBackend.entities.concretes.User;

public interface AuthService {
	void register(User user);

	void login(User user);
}

package WorkBackend.business.abstracts;

import java.util.List;

import WorkBackend.entities.concretes.User;

public interface UserService {
	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	List<User> getAll();

	boolean getByEmail(User user);

	void verifyUser(int id, String verificationCode);

	User getByEmailAndPassword(User user);
}

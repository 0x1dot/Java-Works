package WorkBackend.dataAccess.abstracts;

import java.util.List;

import WorkBackend.entities.concretes.User;

public interface UserDao {
	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	List<User> getAll();

	boolean getByEmail(User user);

	void verifyUser(int id);

	User getByEmailAndPassword(User user);
}

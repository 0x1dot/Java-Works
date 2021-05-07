package WorkBackend.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import WorkBackend.dataAccess.abstracts.UserDao;
import WorkBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanıcı eklendi " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		var index = users.indexOf(user);
		users.remove(index);
		users.add(index, user);
		System.out.println("Kullanıcı düzenlendi " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		users.removeIf(obj -> obj.getId() == user.getId());
		System.out.println("Kullanıcı silindi " + user.getFirstName());
	}

	@Override
	public User get(int id) {
		return users.stream().filter(obj -> Integer.toString(id).equals(Integer.toString(obj.getId()))).findFirst()
				.orElse(null);
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public boolean getByEmail(User user) {
		return users.stream().filter(obj -> obj.getEmail().equals(user.getEmail())).findFirst().isPresent();
	}

	@Override
	public void verifyUser(int id) {
		get(id).setVerified(true);
	}

	@Override
	public User getByEmailAndPassword(User user) {
		return users.stream()
				.filter(obj -> obj.getEmail() == user.getEmail() && obj.getPassword() == user.getPassword()).findFirst()
				.orElse(null);
	}
}

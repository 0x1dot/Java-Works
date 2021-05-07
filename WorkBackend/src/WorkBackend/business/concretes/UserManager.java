package WorkBackend.business.concretes;

import java.util.Base64;
import java.util.List;

import WorkBackend.business.abstracts.UserService;
import WorkBackend.core.business.ValidationRules;
import WorkBackend.dataAccess.abstracts.UserDao;
import WorkBackend.entities.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public boolean getByEmail(User user) {
		return userDao.getByEmail(user);
	}

	@Override
	public void verifyUser(int id, String verificationCode) {
		if (ValidationRules.run(checkIfUserVerifiedCode(id, verificationCode))) {
			System.out.println("Hesabınız doğrulanamadı, kodunuz düzgün çalışmıyor veya süresi dolmuş!");
			return;
		}
		userDao.verifyUser(id);
		System.out.println("Hesabınız doğrulandı. Sisteme giriş yapabilirsiniz.");
	}

	@Override
	public User getByEmailAndPassword(User user) {
		return userDao.getByEmailAndPassword(user);
	}

	private boolean checkIfUserVerifiedCode(int id, String verificationCode) {
		User user = get(id);
		var encode = Base64.getEncoder().encodeToString((user.getFirstName() + user.getEmail()).getBytes());
		if (encode == verificationCode) {
			return true;
		}
		return false;
	}
}
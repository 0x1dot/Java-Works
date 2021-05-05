package Concrete;

import Abstract.MernisCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	MernisCheckService _mernisCheckService;

	public UserManager(MernisCheckService mernisCheckService) {
		this._mernisCheckService = mernisCheckService;
	}

	@Override
	public void register(User user) {
		if (_mernisCheckService.checkIfRealPerson(user)) {
			System.out.println("Oyuncu sisteme eklendi." + "\n" + "\n" + "Oyuncu ismi :" + user.getFirstName() + " " + user.getLastName() + "\n"
					+ "Oyuncu kimlik numarası :" + user.getNationalityId() + "\n" + "Oyuncu doğum tarihi :"
					+ user.getBirthYear() + "\n" + "Oyuncunun sistemdeki ID numarası :" + user.getId() + "\n");
		} else {
			System.out.println("Kullanıcı bilgileri doğrulanamadı. Sisteme kayıt yapılamadı.");
		}

	}

	@Override
	public void updateData(User user) {
		System.out.println("Oyuncu bilgileri güncellendi : " + user.getFirstName() + " " + user.getLastName());

	}

	@Override
	public void deleteData(User user) {
		System.out.println("Oyuncu bilgileri silindi : " + user.getId() + " " + user.getFirstName() + " " + user.getLastName() + " " + user.getNationalityId() + " "
				+ user.getBirthYear());
	}
}
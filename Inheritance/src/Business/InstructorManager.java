package Business;

import Model.Instructor;

public class InstructorManager extends UserManager {

	public void getInformation(Instructor instructor) {
		System.out.println("Öğretmenin Adı: " + instructor.getFirstName() + " " + instructor.getLastName());
		System.out.println("İletişim: " + instructor.getEmail());
		System.out.println("Tecrübe Yılı: " + instructor.getExperience());

	}

	public void addUser(Instructor i) {

		Instructor instructor = new Instructor(i.getFirstName(), i.getLastName(), i.getEmail(), i.getUsername(),
				i.getPassword(), i.getExperience());
		i.instructors.add(instructor);
		System.out.println("Öğretmen Oluşturuldu");
	}

	public void removeUser(Instructor ins) {
		String username = ins.getUsername();

		for (int i = 0; i < ins.instructors.size(); i++) {
			if (ins.instructors.get(i).getUsername().equals(username)) {
				System.out.println("Kullanıcı Adınızı Değiştirmek için Şifrenizi Giriniz: ");
				String password = scanner.nextLine();

				if (password.equals(ins.instructors.get(i).getPassword())) {
					ins.instructors.remove(i);
					System.out.println("Öğretmen Silindi");
				} else {
					System.out.println("Yanlış şifre Girdiniz. işleminiz Gerçekleştirilemedi.");
				}
			} else {
				System.out.println("Böyle bir öğretmen profili bulunamadı.");
			}
		}
	}

}

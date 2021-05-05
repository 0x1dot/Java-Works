package Business;

import java.util.Scanner;

import Model.Student;

public class StudentManager {
	Scanner scanner = new Scanner(System.in);

	public void getInformation(Student student) {
		System.out.println("Öğretmenin Adı: " + student.getFirstName() + " " + student.getLastName());
		System.out.println("İletişim: " + student.getEmail());
		System.out.println("Okul: " + student.getSchool());
		System.out.println("Bölüm: " + student.getDepartment());
	}

	public void addUser(Student s) {

		Student student = new Student(s.getFirstName(), s.getLastName(), s.getEmail(), s.getUsername(), s.getPassword(),
				s.getSchool(), s.getDepartment());
		s.students.add(student);
		System.out.println("Öğrenci Oluşturuldu");
	}

	public void removeUser(Student s) {
		String username = s.getUsername();

		for (int i = 0; i < s.students.size(); i++) {
			if (s.students.get(i).getUsername().equals(username)) {
				System.out.println("Kullanıcı adınızı değiştirmek için şifrenizi giriniz : ");
				String password = scanner.nextLine();

				if (password.equals(s.students.get(i).getPassword())) {
					s.students.remove(i);
					System.out.println("Öğrenci Silindi");
				} else {
					System.out.println("Yanlış Şifre Girdiniz. İşleminiz Gerçekleştirilemedi.");
				}
			} else {
				System.out.println("Böyle bir öğrenci profili bulunamadı.");
			}
		}
	}
}

package Entities;

import Abstract.Entity;

public class Customer implements Entity {
	int Id;
	String FirstName;
	String LastName;
	int BirthYear;
	String NationalityId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getBirthYear() {
		return BirthYear;
	}
	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
}
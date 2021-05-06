package interfaceAbstructMemphisDemo.Entities;

import java.sql.Date;
import java.time.LocalDate;

import interfaceAbstructMemphisDemo.Abstruct.IEntity;

	public class Customer implements IEntity {
		
	 private  int id;
	 private String firstName;
	 private String LasttName;
	 private LocalDate dateOfBirth;
	 private String nationalityId;
	 
	public Customer(int id, String firstName, String lasttName, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		LasttName = lasttName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return LasttName;
	}
	public void setLasttName(String lasttName) {
		LasttName = lasttName;
	}
	public LocalDate getdateOfBirth() {
		return dateOfBirth;
	}
	public void setdateOfBirth(Date dateOfBirthDay) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

}

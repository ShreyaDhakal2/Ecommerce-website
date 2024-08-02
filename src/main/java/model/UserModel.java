package model;

import java.time.LocalDate;
import java.io.Serializable;


public class UserModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private LocalDate dob;
	private String gender;
	private String email;
	private String phoneNumber;
	private String role;
	private String username;
	private String password;
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
public UserModel(String firstName, String lastName,
		LocalDate dob, String gender, String email, String phoneNumber, String role,
		String username, String password) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.dob = dob;
	this.gender =gender;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.role = role;
	this.username = username;
	this.password = password;
	
}
	
}



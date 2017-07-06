package com.paymoon.basic.po;

import java.sql.Timestamp;

public class Student  implements java.io.Serializable {
	/**
	 * 2 serialVersionUID 描述
	 */
	private static final long serialVersionUID = 8851923046131294558L;
	private String id;
	private Timestamp dateOfBirth;
	private String emailAddress;
	private String firstName;
	private String lastName;
	private String password;
	private String userName;
	private String name;
	/** 3 default constructor */
	public Student() {
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public Timestamp getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", firstName="
				+ firstName + ", lastName=" + lastName + ", password=" + password + ", userName=" + userName + ", name="
				+ name + "]";
	}

}
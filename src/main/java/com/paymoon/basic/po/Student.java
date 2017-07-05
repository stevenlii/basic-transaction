package com.paymoon.basic.po;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student", catalog = "test")
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
	/** 4 ID */
	 @Id
     @GeneratedValue(generator = "hibernate-uuid")
     @GenericGenerator(name = "hibernate-uuid", strategy = "uuid")
	 /** 5 Column */
     @Column(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Column(name = "dateOfBirth")
	public Timestamp getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Timestamp dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Column(name = "emailAddress")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Column(name = "firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name = "lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name = "userName")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
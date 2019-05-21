package com.mbf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "secondName")
	private String secondName;
	@Column(name = "emailAddress")
	private String emailAddress;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	private GenderType gender;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "dob")
	private String dob;
	@Column(name = "profileImage")
	private String ProfileImage;
	@Column(name = "address")
	private String address;
	@Column(name = "status")
	private String status;
	@Column(name = "description")
	private String Description;
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public GenderType getGender() {
		return gender;
	}
	public String getMobile() {
		return mobile;
	}
	public String getDob() {
		return dob;
	}
	public String getProfileImage() {
		return ProfileImage;
	}
	public String getAddress() {
		return address;
	}
	public String getStatus() {
		return status;
	}
	public String getDescription() {
		return Description;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setProfileImage(String profileImage) {
		ProfileImage = profileImage;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setDescription(String description) {
		Description = description;
	}
	/*@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName
				+ ", secondName=" + secondName + ", emailAddress="
				+ emailAddress + ", mobile=" + mobile + ", gender=" + gender
				+ ", dob=" + dob + ", ProfileImage=" + ProfileImage
				+ ", address=" + address + ", status=" + status
				+ ", Description=" + Description + "]";
	}

*/
	
}

package com.mbf.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

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

	@Transient
	private MultipartFile image;
	
	@Transient
	private MultipartFile image2;

	@Column(name = "profileImage")
	private byte[] profileImage;
	
	@Column(name = "profileImage2")
	private String profileImage2;
	

	public MultipartFile getImage2() {
		return image2;
	}

	public String getProfileImage2() {
		return profileImage2;
	}

	public void setImage2(MultipartFile image2) {
		this.image2 = image2;
	}

	public void setProfileImage2(String profileImage2) {
		this.profileImage2 = profileImage2;
	}

	@Column(name = "address")
	private String address;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "language")
	private String language;

	public String getState() {
		return state;
	}

	public String getLanguage() {
		return language;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "status")
	private String status;

	@Column(name = "description")
	private String Description;

	@Column(name = "createdAt")
	public Date createdAt;

	@Column(name = "updatedAt")
	public Date updatedAt;

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
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

	public byte[] getProfileImage() {
		return profileImage;
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

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
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

	/*
	 * @Override public String toString() { return "Customer [id=" + id +
	 * ", firstName=" + firstName + ", secondName=" + secondName +
	 * ", emailAddress=" + emailAddress + ", mobile=" + mobile + ", gender=" +
	 * gender + ", dob=" + dob + ", ProfileImage=" + ProfileImage + ", address="
	 * + address + ", status=" + status + ", Description=" + Description + "]";
	 * }
	 */

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

}

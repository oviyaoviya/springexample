package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Emp {
	private int id;
	private String name;
	private String dob;
	private String joiningDate;
	private Date relievingDate;
	private String designation;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private int pincode;
	private GenderType gender;
	private String skill;
	private String mobile;
	private String email;
	private String password;
	private String description;

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", dob=" + dob
				+ ",joining Date=" + joiningDate + ",relieving Date="
				+ relievingDate + " designation=" + designation
				+ ", addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ",  city=" + city + ", state=" + state
				+ ",pincode=" + pincode + ", gender=" + gender + ", skill="
				+ skill + ", mobile=" + mobile + ", email=" + email
				+ ",password=" + password + ", description=" + description
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getRelievingDate() {
		return relievingDate;
	}

	public void setRelievingDate(String relievingDate) throws ParseException {
		// String dateInString = "7-Jun-2013";
		System.out.println("releaving date is:-" + relievingDate);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		try {

			Date utilDate = formatter.parse(relievingDate);
			System.out.println("utilDate is:-" + utilDate);
			this.relievingDate = utilDate;
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finalyy block date:- " + relievingDate);
		}
		}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
/*
 * public Date getDob() { System.out.println("dob in get method:" + dob); return
 * dob; }
 * 
 * public void setDob(String dob) { System.out.println("dob in set method:" +
 * dob); Date date1 = null; try { date1 = (Date) new
 * SimpleDateFormat("yyyy-MM-dd").parse(dob); } catch (ParseException e) {
 * System.out.println("Exception thrown on:- " + e); }
 * System.out.println("DOB after converstion:- " + date1); this.dob = date1; }
 */

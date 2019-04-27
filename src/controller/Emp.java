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

	public void setRelievingDate(String relievingDate1) throws ParseException {
		/*
		 * System.out.println("relieving date:"+relievingDate); Date date = new
		 * Date(); System.out.println("new date: "+date);
		 */
		/*
		 * SimpleDateFormat formatter = new
		 * SimpleDateFormat("MM/dd/yyyy hh:mm:ss"); String strDate =
		 * formatter.format(date); System.out.println("Date Format  : "
		 * +strDate); System.out.println("tostring values : "+this.toString());
		 */

		/*
		 * String sDate1="31-Dec-1998"; SimpleDateFormat formatter1=new
		 * SimpleDateFormat("dd-MMM-yyyy"); Date date1=formatter1.parse(sDate1);
		 * System.out.println(sDate1+"\t"+date1); this.relievingDate = date1;
		 */
		// String dateInString = "7-Jun-2013";
		System.out.println("releaving date is:-" + relievingDate1);
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");

		try {

			Date utilDate = formatter.parse(relievingDate1);
			System.out.println("utilDate is:-" + utilDate);
			this.relievingDate = utilDate;
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finalyy block date:- " + relievingDate);
		}

		/*
		 * String rawDate = "2015-05-12 15:15:24";
		 * 
		 * SimpleDateFormat format = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); Date date =
		 * format.parse(rawDate); java.sql.Date sqlDate = new
		 * java.sql.Date(date.getTime());
		 * 
		 * SimpleDateFormat changedFormat = new SimpleDateFormat("YYYY-MM-DD");
		 * System.out.println("Formatted Date: " +
		 * changedFormat.format(sqlDate));
		 */
		// this.relievingDate = date;
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

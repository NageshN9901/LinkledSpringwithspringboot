package com.frankmoley.lil.learningspring.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Guest")
public class Guest {
//	 GUEST_ID BIGSERIAL PRIMARY KEY,
//	  FIRST_NAME VARCHAR(64),
//	  LAST_NAME VARCHAR(64),
//	  EMAIL_ADDRESS VARCHAR(64),
//	  ADDRESS VARCHAR(64),
//	  COUNTRY VARCHAR(32),
//	  STATE VARCHAR(12),
//	  PHONE_NUMBER VARCHAR(24)
	@Id
	
	@Column(name=" GUEST_ID")
	@GeneratedValue(strategy =GenerationType.AUTO)
      private long guestId;
	
	@Column(name="FIRST_NAME")
	private String firstname;
	
	@Column(name="EMAIL_ADDRESS ")
	private String emailaddress ;
	
	@Column(name="ADDRESS ")
	private String address;

	@Column(name="COUNTRY ")
	private String country ;
	
	@Column(name="STATE ")
	private String state;
	@Column(name="PHONE_NUMBER ")
	private String phonenumber;
	// now need set and get methods
	public long getGuetId() {
		return guestId;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public String getAddress() {
		return address;
	}
	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setGuetId(long guetId) {
		this.guestId = guetId;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	// now nees to string
	@Override
	public String toString() {
		return "Guest "+
				 "[guetId=" + guestId + 
				", firstname=" + firstname + 
				", emailaddress=" + emailaddress + 
				", address="+ address +
				", country=" + country +
				", state=" + state + ","+
				 " phonenumber=" + phonenumber + "]";
	}
	
	
}

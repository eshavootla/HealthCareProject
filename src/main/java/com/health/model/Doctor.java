package com.health.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="doctor")
public class Doctor {
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column
	private int doctorId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private Calendar dob;
	@Column
	private String address;
	@Column
	private String phoneNumber;
	@Column
	private String speciality;

	public Doctor() {
		super();
	}

	public Doctor(String firstName, String lastName, Calendar dob, String address, String phoneNumber,
			String speciality) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.speciality = speciality;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
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

	public Calendar getDob() {
		return dob;
	}

	public void setDob(Calendar dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}

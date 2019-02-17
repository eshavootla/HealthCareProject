package com.health.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int appointmentId;
	@Column
	private Date date;
	@Column
	private String time;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkPatientId",referencedColumnName="patientId")
	private Patient patient;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkDoctorId",referencedColumnName="doctorId")
	private Doctor doctor;

	public Appointment() {
		super();
	}

	public Appointment(Date date, String time, Patient patient, Doctor doctor) {
		super();
		this.date = date;
		this.time = time;
		this.patient = patient;
		this.doctor = doctor;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}

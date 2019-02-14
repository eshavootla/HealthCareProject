package com.health.model;

import java.util.Calendar;

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
	private Calendar date;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fkPatientId")
	private Patient patient;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fkDoctorId")
	private Doctor doctor;

	public Appointment() {
		super();
	}

	public Appointment(Calendar date, Patient patient, Doctor doctor) {
		super();
		this.date = date;
		this.patient = patient;
		this.doctor = doctor;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
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

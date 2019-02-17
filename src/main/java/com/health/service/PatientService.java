package com.health.service;

public interface PatientService {
	public String createProfile();
	public String viewProfile();
	public String updateProfile();
	public String deleteProfile();
	public String createAppointments();
	public String viewAppointments();
	public String updateAppointments();
	public String deleteAppointments();
	
	public String viewDoctor();
	public String viewPrescription();
	public String viewPayments();
	public String viewMedicalHistory();
	
}

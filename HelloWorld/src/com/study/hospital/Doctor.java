package com.study.hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
	
	private String doctorName;
	private String doctorSpecialization;
	
	private List<Patient> patients = new ArrayList<Patient>();
	
	public void addPatients(Patient patient) {
		patients.add(patient);
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	public String toString() {
		return doctorName + " " + doctorSpecialization;
	}

}

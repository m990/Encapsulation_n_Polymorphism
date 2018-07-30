package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctorList = new ArrayList<>();
	ArrayList<Patient> patientList = new ArrayList<>();
	public void addDoctor(Doctor doc) {
		doctorList.add(doc);
	}
	public void addPatient(Patient person) {
		patientList.add(person);
	}
	public ArrayList<Doctor> getDoctors() {
		return doctorList;
	}
	public ArrayList<Patient> getPatients(){
		return patientList;
	}
	public void assignPatientsToDoctors() throws DoctorFullException {
		for (int i = 0; i < doctorList.size(); i++) {
			try {
				doctorList.get(i).assignPatient(patientList.get(i));
				doctorList.get(i).assignPatient(patientList.get(i+1));
				doctorList.get(i).assignPatient(patientList.get(i+2));
			}
			catch (IndexOutOfBoundsException e) {
				break;
			}
		}
	}
}

package hospital;

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
		int j = 0;
		for (int i = 0; i < patientList.size(); i++) {
			try {
				doctorList.get(j).assignPatient(patientList.get(i));
				j++;
				if (j == doctorList.size()) {
					j = 0;
				}
			}
			catch (IndexOutOfBoundsException e) {
				break;
			}
		}
	}
}

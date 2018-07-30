package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patientList = new ArrayList<>();
 	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	public boolean assignPatient(Patient person) throws DoctorFullException {
		if (patientList.size() == 3) {
			throw new DoctorFullException();
		}
		else {
			patientList.add(person);
			return true;
		}
	}
	public ArrayList<Patient> getPatients(){
		return patientList;
	}
	public void doMedicine() {
		for (Patient p: patientList) {
			p.setFeelsCaredFor(true);
		}
	}
}

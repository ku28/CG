import java.util.ArrayList;
import java.util.List;

class Patient {
    private final String name;
    private final List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println(name + " has consulted:");
        for (Doctor d : doctors) {
            System.out.println(d.getName());
        }
    }
}

class Doctor {
    private final String name;
    private final List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Dr. " + name + " has seen:");
        for (Patient p : patients) {
            System.out.println(p.getName());
        }
    }
}

class Hospital {
    private final List<Doctor> doctors;
    private final List<Patient> patients;

    public Hospital(String name) {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor docA = new Doctor("Smith");
        Doctor docB = new Doctor("Jones");
        Patient pat1 = new Patient("Alice");
        Patient pat2 = new Patient("Bob");

        hospital.addDoctor(docA);
        hospital.addDoctor(docB);
        hospital.addPatient(pat1);
        hospital.addPatient(pat2);

        docA.consult(pat1);
        docA.consult(pat2);
        docB.consult(pat1);

        docA.showPatients();
        docB.showPatients();
        pat1.showDoctors();
        pat2.showDoctors();
    }
}

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalAppointmentSystem {
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Appointment> appointments;

    public MedicalAppointmentSystem() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor " + doctor.getName() + " added.");
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added");
    }

    public void scheduleAppointment(Patient patient, Doctor doctor, LocalDateTime dateTime) {
        Appointment appointment = new Appointment(doctor, patient, dateTime);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully!");
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
                System.out.println("---------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        MedicalAppointmentSystem system = new MedicalAppointmentSystem();

        Doctor doc1 = new Doctor("Dr. John Smith", "Cardiologist");
        Doctor doc2 = new Doctor("Dr. Emily Davis", "Dermatologist");
        system.addDoctor(doc1);
        system.addDoctor(doc2);

        Patient pat1 = new Patient("Alice Johnson", 30);
        Patient pat2 = new Patient("Bob Brown", 45);
        system.addPatient(pat1);
        system.addPatient(pat2);

        system.scheduleAppointment(pat1, doc1, LocalDateTime.of(2024, 9, 25, 14, 0));
        system.scheduleAppointment(pat2, doc2, LocalDateTime.of(2024, 9, 26, 16, 0));

        system.viewAppointments();
    }
}

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Appointment {

    private Doctor doctor;
    private Patient patient;
    private LocalDateTime appointmentDateTime;

    public Appointment(Doctor doctor, Patient patient, LocalDateTime appointmentDateTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.appointmentDateTime = appointmentDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    @Override
    public String toString() {
        return "Appointment with Dr." + doctor.getName() + " (Specialization: " + doctor.getSpecialization() + ")" +
                "\nPatient: " + patient.getName() + " (Age: " + patient.getAge() + ")" + "\nDate and Time: " + appointmentDateTime;
    }
}

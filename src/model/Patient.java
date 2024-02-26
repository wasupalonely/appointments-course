package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    public String birthday;
    private double weight;
    private double height;
    public String blood;

    private ArrayList<ApointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurse = new ArrayList<>();

    public ArrayList<ApointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        ApointmentDoctor apointmentDoctor = new ApointmentDoctor(this, doctor);
        apointmentDoctor.schedule(date, time);
        appointmentDoctors.add(apointmentDoctor);
    }

    public Patient(String name, String email) {
        super(name, email);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurse() {
        return appointmentNurse;
    }

    public void setAppointmentNurse(ArrayList<AppointmentNurse> appointmentNurse) {
        this.appointmentNurse = appointmentNurse;
    }

    public String getWeight() {
        return weight + "Kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height + "Mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\n Weight: " + weight + getWeight() +
                "\nHeight " + getHeight() + "\nBlood " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde el nacimiento");
    }
}

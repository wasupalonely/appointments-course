package model;

import model.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;

    public Doctor(String name, String email) {
        super(name, email);
        this.speciality = speciality;
    }

    @Override
    public void showDataUser() {
        System.out.println("Empleado del hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time) {


        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "Speciality " + speciality + "\nAvailable" + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            this.time = time;
        }

        @Override
        public String toString() {
            return "Available apointments \nDate: " + date + "\nTime " + time;
        }
    }
}

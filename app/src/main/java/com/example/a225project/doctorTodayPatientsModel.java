package com.example.a225project;

public class doctorTodayPatientsModel {

    String Patient_Name;
    String Ward_ID;
    String Bed_No;
    String Time;
    String Illness;
    String Age;
    String PatientID;
    int Patient_profilePic;


    public doctorTodayPatientsModel(String patient_Name, String ward_ID, String bed_No, String time, int patient_profilePic) {
        this.Patient_Name = patient_Name;
        this.Ward_ID = ward_ID;
        this.Bed_No = bed_No;
        this.Time = time;
        this.Patient_profilePic = patient_profilePic;
    }

    public doctorTodayPatientsModel(String patient_Name, String ward_ID, String bed_No, String time, String illness, String age, String patientID, int patient_profilePic) {
        Patient_Name = patient_Name;
        Ward_ID = ward_ID;
        Bed_No = bed_No;
        Time = time;
        Illness = illness;
        Age = age;
        PatientID = patientID;
        Patient_profilePic = patient_profilePic;
    }

    public String getPatient_Name() {
        return Patient_Name;
    }

    public String getWard_ID() {
        return Ward_ID;
    }

    public String getBed_No() {
        return Bed_No;
    }

    public String getTime() {
        return Time;
    }

    public int getPatient_profilePic() {
        return Patient_profilePic;
    }

    public String getIllness() {
        return Illness;
    }

    public String getAge() {
        return Age;
    }

    public String getPatientID() {
        return PatientID;
    }
}

package com.company;

public class Hospital {
    private int patientCount;
    private int doctorCount;
    private Patient[] patients = new Patient[5];
    private Healer[] doctors = new Healer[3];

    public  boolean receivePatient(Patient newPatient){
        if (newPatient.getMoney() <= 0 && !newPatient.isInsurance()){
            return false;
        }
        if (patientCount == patients.length){
                return false;
        }
        if (newPatient.getHealth() >= 100 ) {
            return false;
        }
        int foundDoctorIndex = -1;
        for(int i = 0; i < doctorCount; i++){
            if (doctors[i].ifCanHeal(newPatient)){
                foundDoctorIndex = i;
            }
        }
        if (foundDoctorIndex == -1){
           return false;
        }
        doctors[foundDoctorIndex].addPatient(newPatient);
        System.out.println("Patient leg v bolnitcu");
        return true;
    }
    public void releasePatient(Ailing patient1, Ailing patient){
        for (int i=0;i<patientCount;i++){
            if(patients[i].getHealth()>=100){
                //\\ А как же удаление пациента из больницы ? :)
                System.out.println("Patient released");

            }
        }
    }
    public boolean receiveDoctor(Healer doctor){
        if(doctorCount == doctors.length){
            return false;
        }
        doctors[doctorCount] = doctor;
        doctorCount++;
        System.out.println("Doctor prishel v bolnitcu");
        return true;
    }
    public void heal(){
        for (int i = 0; i <doctorCount ; i++) {
            doctors[i].heal();
        }
    }

}

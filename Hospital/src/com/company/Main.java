package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient();
        //Healer doctor = new Doctor();
       Doctor doctor = new Doctor(25, Diagnosis.PANCREATIT, 15 );
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Enter patient's health");
        patient1.health=scan.nextInt();
        System.out.println("2 - Enter patient's money");
        patient1.money=scan.nextInt();
        System.out.println("3 - Does patient has insurance?");
        patient1.insurance=scan.nextBoolean();
        System.out.println("4 - Diagnosis");
        patient1.diagnosis=Diagnosis.valueOf(scan.next().toUpperCase());


        System.out.println("1 - Enter patient's health");
        patient2.health=scan.nextInt();
        System.out.println("2 - Enter patient's money");
        patient2.money=scan.nextInt();
        System.out.println("3 - Does patient has insurance?");
        patient2.insurance=scan.nextBoolean();
        System.out.println("4 - Diagnosis");
        patient2.diagnosis=Diagnosis.valueOf(scan.next().toUpperCase());

        System.out.println("1 - Enter doctor's skill");
        doctor.skill=scan.nextInt();
        System.out.println("2 - Enter doctor's diagnosis");
        doctor.diagnosis=Diagnosis.valueOf(scan.next().toUpperCase());
        System.out.println("1 - Enter doctor's cost");
        doctor.cost=scan.nextInt();

        Hospital hospital = new Hospital();
        hospital.receiveDoctor(doctor);
        hospital.receivePatient(patient1);
        hospital.receivePatient(patient2);
        hospital.heal();
        doctor.releasePatient(patient2, patient1);
        hospital.releasePatient(patient1, patient2);
    }
}

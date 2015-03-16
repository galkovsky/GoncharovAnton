package com.company;

/**
 * Created by support on 11.03.15.
 */
public interface Healer extends  Ailing{
    void heal();

    boolean ifCanHeal(Ailing patient);

    void addPatient(Patient patient);

    void releasePatient(Ailing patient2, Ailing patient);

    int getSkill();
}

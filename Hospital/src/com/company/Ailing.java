package com.company;

/**
 * Created by support on 11.03.15.
 */
public interface Ailing {
    boolean increase(int health);

    int getMoney();

    Diagnosis getDiagnosis();

    int getHealth();

    boolean isInsurance();
}

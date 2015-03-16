package com.company;

/**
 * Created by support on 13.03.15.
 */
public class ConnectDiagnosis {
    Diagnosis diagnosis;

    public ConnectDiagnosis(Diagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setDiagnosisToDoctor() {
        switch (diagnosis) {
            case BRONHIT:
                System.out.println("Idite k Terapevt");
                break;

            case GASTRIT:
                System.out.println("Idite k Gastroenterolog");
                break;

            case PANCREATIT:
                System.out.println("Idite k Gastroenterolog");
                break;

            case DISTONIA:
                System.out.println("Idite k Nevrolog");
                break;

        }
    }
}

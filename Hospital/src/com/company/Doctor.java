package com.company;

public class Doctor extends Human implements Healer {
    public int skill;
    //\\ Тебе нужно было создать массив диагнозов. Ведь доктор может лечить несколько диагнозов.
    //\\ Хотя... может быть это у тебя так задумано :)
    //\\ В любом случае, он выглядел бы как обычный массив любого из известных вам типов
    //\\ вроде
    //\\ Diagnosis[] diagnosis;
    Diagnosis diagnosis;
    int cost;
    private int patientCount;
    private Patient[] patients = new Patient[5];

    public Doctor(int skill, Diagnosis diagnosis, int cost) {
        this.skill = skill;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }

    public int getSkill() {
        return 0;
    }

    @Override
    public void heal() {
        for (int i = 0; i < patientCount; i++) {
            int min = Math.min(skill, patients[i].getMoney());
            patients[i].increase(min);
            System.out.println("Пациент стал здоровее на " + min + " значение");
        }

    }

    @Override
    public boolean ifCanHeal(Ailing patient) {
        if (patientCount == patients.length) {
            System.out.println("Я не могу лечить этого пациента");
            //\\А зачем убрал проверку на диагнозы и возврат false в случае неподходящего доктора?
            //return false;
        }
       /* for(int i = 0; i < diagnosis.length; i++){
            if (diagnosis.equalsIgnoreCase(patient.getDiagnosis())){
                System.out.println("Я могу лечить этого пациента");
                return true;
            }
        }*/
        //System.out.println("Я не могу лечить этого пациента");
        return true;
    }

    @Override
    public void addPatient(Patient patient) {
        patients[patientCount] = patient;
        patientCount++;
        System.out.println("Пациент добавлен к доктору");
    }

    @Override
    //\\ Смотри, у тебя не используются аргументы, которые ты передаешь в метод (Ailing patient2, Ailing patient)
    //\\ В таком случае их можно убрать
    public void releasePatient(Ailing patient2, Ailing patient) {
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getHealth() >= 100) {
                System.out.println("Patient released");

            }
        }
    }

    @Override
    public boolean increase(int health) {
        return false;
    }

    @Override
    public int getMoney() {
        return 0;
    }

    @Override
    public Diagnosis getDiagnosis() {
        return null;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public boolean isInsurance() {
        return false;
    }
}

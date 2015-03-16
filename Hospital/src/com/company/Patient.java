package com.company;

public class Patient extends Human implements Ailing {
    //\\ Лучше использовать setters\getters для доступа к перменным класса.
    //\\ Если у тебя в интерфейсе Ailing указаны лишь getter'ы, то ты все равно можешь добавить setters и использовать их в этом классе
    int health;
    int money;
    boolean insurance;
    Diagnosis diagnosis;

    //\\ Чем же тебе конструктор не угодил ? :)
    /*public Patient(int health, int money, boolean insurance, Diagnosis diagnosis) {
        this.health = health;
        this.money = money;
        this.insurance = insurance;
        this.diagnosis = diagnosis;
    }*/

    @Override
    public boolean increase(int health){
        this.health+=health;
        return health >= 100;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public boolean isInsurance() {
        return insurance;
    }


}

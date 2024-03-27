package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine=true;//motor
    private int cylinders;//arçta silindir sayısı
    private String name;
    private int wheels=4;//tekerlek

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheels=4;
    }

    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getClassSimpleName(){
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getCylinders() == car.getCylinders() && Objects.equals(getName(), car.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash( cylinders, name);
    }
    public String startEngine(){
        getClassSimpleName();
        return "the car's engine is starting";
}
    public String accelerate(){
        getClassSimpleName();
        return "the car is accelerating";
    }
    public String brake(){
        getClassSimpleName();
        return "the car is braking";
    }

}

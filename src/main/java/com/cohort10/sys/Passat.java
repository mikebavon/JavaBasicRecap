package com.cohort10.sys;

public class Passat extends Volkswagen implements VolkswagenI{

    public void startEngine() {
        System.out.println("V 4 CYLINDER ENGINE: DIESEL ONLY");
    }

    public void stopEngine(){
        System.out.println("Stopping engine of PASSAT");
    }
}

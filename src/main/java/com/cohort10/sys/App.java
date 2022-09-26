package com.cohort10.sys;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //inheritance
        Volkswagen v1 = new Toureg();
        v1.setYearInvention(1960);

        Volkswagen v2 = new Tiguan();
        v2.setYearInvention(1970);

        VolkswagenI v3 = new Passat();

        System.out.println(v1.getYearInvention());
        System.out.println(v2.getYearInvention());
        v3.stopEngine();

        //polymorphism
        v1.startEngine();
        v2.startEngine();
        v3.startEngine();
    }
}

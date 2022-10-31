package com.moyaga.creationalDesignPatterns.Singleton;

public class SingletonDemo {
    public static void main(String[] args){
        //Created time before and time after to know how much time it will
        //consume to instantiate the object for the first time
        //And to know how much time it would consume to get that instance
        long timeBefore=0;
        long timeAfter=0;

        timeBefore=System.currentTimeMillis();
        Singleton instance = Singleton.getInstance();
        timeAfter=System.currentTimeMillis();
        System.out.println(instance);
        System.out.println(timeAfter -timeBefore);

        timeBefore=System.currentTimeMillis();
        Singleton anotherInstance = Singleton.getInstance();
        timeAfter=System.currentTimeMillis();
        System.out.println(anotherInstance);
        System.out.println(timeAfter - timeBefore);
    }
}

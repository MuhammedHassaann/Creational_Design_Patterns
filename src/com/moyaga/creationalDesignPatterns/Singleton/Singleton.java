package com.moyaga.creationalDesignPatterns.Singleton;

public class Singleton {
    /**
     --------------------------------(Making it Lazily loaded)----------------------------------
        // We're making it equal to null just to make it lazily loaded
        // if we instantiated the object it will be eagerly loaded
        // and we are making that to save space in memory and use it only when we need
     ---------------------------------(Making it thread-safe)------------------------------------
         //using volatile ensure that instance will remain singleton through any of the changes
         //Avoiding reflection by not creating another instance
     */
    private static volatile Singleton instance =null;

    private Singleton(){
        /**
             //Protect our code from having reflection
         */

        if (instance != null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Singleton getInstance(){
        /**
            //We are using double checking of the nullable of the instance
         */
        if (instance == null){
            /**
                //synchronized is used to lock the code in case of multi-threading
                //to make the second thread wait till the first thread finishes it's job
                //to avoid creating another instance
             */
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
package com.designpatterns.creational.singleton;

/*
 * With double-checked locking, we first check to see if an instance is created, 
 * and if not, THEN we synchronize. This way, we only synchronize the first 
 * time through, just what we want.
 * 
 * If performance is an issue in your use of the getInstance() method then this 
 * method of implementing the Singleton can drastically reduce the overhead.
 */
public class SingletonWithDoubleCheckedLocking {

    /*
     * The volatile keyword ensures that multiple threads handle the soleInstance
     * variable correctly when it is being initialized to the Singleton instance.
     */
    private volatile static SingletonWithDoubleCheckedLocking soleInstance = null;

    private SingletonWithDoubleCheckedLocking() {
        System.out.println("Creating...");
    }

    public static SingletonWithDoubleCheckedLocking getInstance() {
        // check for an instance. If there isn't one, enter a synchronized block
        if (soleInstance == null) {
            synchronized (SingletonWithDoubleCheckedLocking.class) {
                if (soleInstance == null)
                    soleInstance = new SingletonWithDoubleCheckedLocking();
            }
        }
        return soleInstance;
    }
}
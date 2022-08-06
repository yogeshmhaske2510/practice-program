package com.designpattern.singletone;

public class SingletoneClass {
    private SingletoneClass() {}

    /**
     * Eagar initialization
     */
    /*private static SingletoneExample instance = new SingletoneExample();
    public static SingletoneExample getInstance() {
        return instance;
    } */

    /**
     * static initialization
     */
    /*private static SingletoneExample instance;
    static {
        instance = new SingletoneExample();
    }*/

    /**
     * Lazy initalization
     * */
    /*private static SingletoneExample instance;
    public static SingletoneExample getInstance() {
        if(instance == null) {
            instance = new SingletoneExample();
        }
        return  instance;
    }*/

    /**
     * Thread safe
     * */
    /*private static SingletoneExample instance;
    public static synchronized SingletoneExample getInstance() {
        if(instance == null) {
            instance = new SingletoneExample();
        }
        return instance;
    }*/

    /**
     * Lazy initialization with double check
     * */
    private static SingletoneClass instance;
    public static SingletoneClass getInstance() {
        if(instance == null) {
            synchronized (SingletoneClass.class) {
                if(instance == null) {
                    instance = new SingletoneClass();
                }
            }
        }
        return instance;
    }
}

package com.javalearning.threads;

public class Restaurant {

    // Only one thread can run cook at a time
    // Object Level Locking
    public synchronized void cook(String chefName) { // Thread safe function
        System.out.println(Thread.currentThread().getName() + " " + chefName+ " is cooking");
        try {
            Thread.sleep(5000); // Putting thread in block state for 5 sec
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void cook1(String chefName) { // Thread safe function
        System.out.println("Access Fridge");
        System.out.println("Access Vegetables & Tools");
        synchronized (this) { // synchronized block
            try {
                System.out.println(Thread.currentThread().getName() + " " + chefName + " is cooking");
                Thread.sleep(5000); // Putting thread in block state for 5 sec
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // Class Level Locking
    public synchronized static void serve(Thread chef, String serveName) {
        try {
            chef.join(); // wait chef to complete the cooking
            // Serve will move to Block State until chef thread complete it task
            System.out.println(Thread.currentThread().getName() + " " + serveName + " is serving");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void serve1(Thread chef, String serveName) {
        System.out.println("Menu of resturant");
        System.out.println("Water bottle & Other complementary snacks");

        synchronized (Restaurant.class) {
            try {
                chef.join(); // wait chef to complete the cooking
                // Serve will move to Block State until chef thread complete it task
                System.out.println(Thread.currentThread().getName() + " " + serveName + " is serving");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

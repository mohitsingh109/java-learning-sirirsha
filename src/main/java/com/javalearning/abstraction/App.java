package com.javalearning.abstraction;

public class App {

    public static void main(String[] args) {
        IPhone iPhone = new IPhone("Iphone", 2015, "12 Pro");
        Samsung samsung = new Samsung("Samsung s22", 2023);
        //iPhone.displayUI(); // I don't want to call this
        //samsung.displayUI();
        //iPhone.talkingTom();
        f1(iPhone);
        f1(samsung);

        f2(samsung);
    }

    public static void f1(Phone phone) {
        if(phone instanceof IPhone) {
            System.out.println("Ignore calling display UI");
            return;
        } else if(phone instanceof Samsung) {
            // do something
        }
        phone.displayUI();
    }

    public static void f2(DisplayUI displayUI) {
        displayUI.display();
    }
}

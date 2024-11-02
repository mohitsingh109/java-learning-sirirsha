package com.javalearning.designpattern.structure.facade.wrong;

public class SoundSystem {

    public void on() {
        System.out.println("Sound system is on");
    }


    public void setVolume(int level) {
        System.out.println("Sound system volume set to " + level);
    }
}

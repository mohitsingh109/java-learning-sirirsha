package com.javalearning.designpattern.structure.facade.wrong;

public class Main {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Light light = new Light();
        Screen screen = new Screen();

        //watch a movie required coordinating multiple actions
        dvdPlayer.on();
        dvdPlayer.play();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(20);
        light.dim();
        screen.lower();
    }
}

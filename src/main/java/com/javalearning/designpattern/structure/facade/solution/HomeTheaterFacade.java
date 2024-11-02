package com.javalearning.designpattern.structure.facade.solution;

import com.javalearning.designpattern.structure.facade.wrong.DVDPlayer;
import com.javalearning.designpattern.structure.facade.wrong.Light;
import com.javalearning.designpattern.structure.facade.wrong.Projector;
import com.javalearning.designpattern.structure.facade.wrong.Screen;
import com.javalearning.designpattern.structure.facade.wrong.SoundSystem;

public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;

    private Projector projector;

    private SoundSystem soundSystem;

    private Light light;

    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Light light, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.light = light;
        this.screen = screen;
    }

    // simplified method to watch a movie
    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        dvdPlayer.on();
        dvdPlayer.play();
        projector.on();
        projector.setInput("DVD");
        soundSystem.on();
        soundSystem.setVolume(20);
        light.dim();
        screen.lower();
        System.out.println("Movie is now playing...");
    }

    public void endMovie() {
        //...
    }
}

package com.javalearning.designpattern.structure.facade.solution;

import com.javalearning.designpattern.structure.facade.wrong.DVDPlayer;
import com.javalearning.designpattern.structure.facade.wrong.Light;
import com.javalearning.designpattern.structure.facade.wrong.Projector;
import com.javalearning.designpattern.structure.facade.wrong.Screen;
import com.javalearning.designpattern.structure.facade.wrong.SoundSystem;

public class Main {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Light light = new Light();
        Screen screen = new Screen();

        HomeTheaterFacade facade = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, light, screen);
        facade.watchMovie();
    }
}

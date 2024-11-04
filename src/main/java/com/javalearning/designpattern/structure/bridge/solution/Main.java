package com.javalearning.designpattern.structure.bridge.solution;

public class Main {

    public static void main(String[] args) {
        Device tv = new Tv();
        Device radio = new Radio();

        //Tv with basic remote
        Remote basicTvRemote = new BasicRemote(tv);
        basicTvRemote.power();
        basicTvRemote.setVolume(40);

        //Radio with basic remote
        Remote basicRadioRemote = new BasicRemote(radio);
        basicRadioRemote.power();
        basicRadioRemote.setVolume(34);
    }
}

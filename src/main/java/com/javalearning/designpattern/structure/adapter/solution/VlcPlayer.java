package com.javalearning.designpattern.structure.adapter.solution;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playMp4(String fileName) {
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("PLaying vlc file. Name: " + fileName);
    }
}

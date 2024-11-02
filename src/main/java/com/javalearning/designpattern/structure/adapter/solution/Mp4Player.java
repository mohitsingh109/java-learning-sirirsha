package com.javalearning.designpattern.structure.adapter.solution;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("PLaying mp4 file. Name: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}

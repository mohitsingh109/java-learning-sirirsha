package com.javalearning.designpattern.structure.adapter.wrong;

//Audio player class that can only play mp3 files
public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")) {
            System.out.println("PLaying mp3 file. Name: "+ fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}

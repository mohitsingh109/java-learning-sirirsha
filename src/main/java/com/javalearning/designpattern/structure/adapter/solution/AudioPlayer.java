package com.javalearning.designpattern.structure.adapter.solution;


//Audio player class that can only play mp3 files
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //Build in support for m3 files
        if(audioType.equals("mp3")) {
            System.out.println("PLaying mp3 file. Name: "+ fileName);
        }

        //MediaAdapter handle other file format
        else  if(audioType.equals("vlc") || audioType.equals("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media.");
        }
    }
}

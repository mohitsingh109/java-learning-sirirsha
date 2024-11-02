package com.javalearning.designpattern.structure.adapter.solution;

public class MediaAdapter implements MediaPlayer{

    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equals("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if(audioType.equals("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        } else if(audioType.equals("avi")) {
            advanceMediaPlayer = new AviPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("vlc")) {
            advanceMediaPlayer.playVlc(fileName);
        } else if(audioType.equals("mp4")) {
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}

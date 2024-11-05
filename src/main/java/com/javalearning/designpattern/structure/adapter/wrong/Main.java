package com.javalearning.designpattern.structure.adapter.wrong;

public class Main {

    public static void main(String[] args) {

        //client
        MediaPlayer mediaPlayer = new AudioPlayer();

        mediaPlayer.play("mp3", "song.mp3");
        mediaPlayer.play("mp4", "video.mp4");
        mediaPlayer.play("vlc", "movie.vlc");

    }
}
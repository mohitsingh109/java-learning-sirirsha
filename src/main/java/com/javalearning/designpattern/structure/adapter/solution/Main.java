package com.javalearning.designpattern.structure.adapter.solution;

public class Main {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new AudioPlayer();
        mediaPlayer.play("mp3", "song.mp3");
        mediaPlayer.play("mp4", "video.mp4");
        mediaPlayer.play("vlc", "movie.vlc");
        mediaPlayer.play("avi", "movie.avi");

    }
}

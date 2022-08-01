package com.hillel.lonzhansky.lessons.lesson13.homework2;

public class Main {


    public static void main(String[] args) {
        MusicStyles[] musicStyles = {new PopMusic(), new PopMusic()};
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}

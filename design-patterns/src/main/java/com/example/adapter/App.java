package com.example.adapter;

// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee class (legacy)
class AudioPlayer {
    public void playAudioFile(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }
}

// Adapter class
class MediaPlayerAdapter implements MediaPlayer {
    private AudioPlayer audioPlayer;

    public MediaPlayerAdapter(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            audioPlayer.playAudioFile(fileName);  // Adapting to the legacy class method
        } else {
            System.out.println("Invalid audio type. Only mp3 supported.");
        }
    }
}




public class App {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        MediaPlayer mediaPlayer = new MediaPlayerAdapter(audioPlayer);


        mediaPlayer.play("mp3", "song.mp3");  // Output: Playing audio file: song.mp3
        mediaPlayer.play("wav", "song.wav");  // Output: Invalid audio type. Only mp3 supported


    }
}

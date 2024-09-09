package com.example.player;


/*
    pattern: Strategy
 */

public class App {
    public static void main(String[] args) {

        // Object based strategy
        NextTrackStrategy fifo=new FIFONextTrackStrategy();
        NextTrackStrategy lifo=new LIFONextTrackStrategy();

        // Functional ( lamdbda ) based strategy

         NextTrackStrategy random = (tracks) -> {
                int index = (int) (Math.random() * tracks.size());
                return tracks.remove(index);
         };

        PlayList playList = new PlayList(fifo);
        playList.addTrack(new Track("Track 1", "Artist 1", "Album 1", "Genre 1", 2020));
        playList.addTrack(new Track("Track 2", "Artist 2", "Album 2", "Genre 2", 2021));
        playList.addTrack(new Track("Track 3", "Artist 3", "Album 3", "Genre 3", 2022));

        //playList.setNextTrackStrategy(lifo);
        playList.setNextTrackStrategy(random);

        Track track = playList.getNextTrack();
        System.out.println(track);

        track = playList.getNextTrack();
        System.out.println(track);

        track = playList.getNextTrack();
        System.out.println(track);

    }
}

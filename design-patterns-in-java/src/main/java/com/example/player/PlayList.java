package com.example.player;

import java.util.List;

// OCP - Open Closed Principles
// LSP - Liskov Substitution Principles

//=> Polymorphism
public class PlayList {

    private List<Track> tracks = new java.util.ArrayList<>();
    private NextTrackStrategy nextTrackStrategy;

    public PlayList(NextTrackStrategy nextTrackStrategy) {
        this.nextTrackStrategy = nextTrackStrategy;
    }

    public void setNextTrackStrategy(NextTrackStrategy nextTrackStrategy) {
        this.nextTrackStrategy = nextTrackStrategy;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(Track track) {
        tracks.remove(track);
    }

    public Track getNextTrack() {
//        Track track= tracks.get(0);
//        tracks.remove(0);
//        return track;
        return nextTrackStrategy.getNextTrack(tracks);
    }

}

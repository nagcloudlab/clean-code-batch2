package com.example.player;

import java.util.List;

public class FIFONextTrackStrategy implements NextTrackStrategy {
    @Override
    public Track getNextTrack(List<Track> tracks) {
        return tracks.remove(0);
    }
}

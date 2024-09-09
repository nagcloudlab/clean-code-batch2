package com.example.player;

import java.util.List;

public class LIFONextTrackStrategy implements NextTrackStrategy {
    @Override
    public Track getNextTrack(List<Track> tracks) {
        return tracks.remove(tracks.size() - 1);
    }
}

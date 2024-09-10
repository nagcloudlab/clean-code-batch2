package com.example.player;

import java.util.List;

public interface NextTrackStrategy {
    Track getNextTrack(List<Track> tracks);
}

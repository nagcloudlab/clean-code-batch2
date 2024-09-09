package com.example.player;

public class Track {

    private String name;
    private String artist;
    private String album;
    private String genre;
    private int year;

    public Track(String name, String artist, String album, String genre, int year) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }

}

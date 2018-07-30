package com.company;

public class Song implements ISong {
    private long id;
    private String name;
    private String artist;
    private String album;
    private int rating;
    private int year;

    public Song(){
        System.out.println("The song constructor just executed");
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long value) {
        id = value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public void setArtist(String value) {
        artist = value;
    }

    @Override
    public String getAlbum() {
        return album;
    }

    @Override
    public void setAlbum(String value) {
        album = value;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int value) {
        rating = value;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int value) {
        year = value;
    }

    public String displaySong(){
        return  getArtist() + " " + getName();
    }
}

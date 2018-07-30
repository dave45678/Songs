package com.company;

public interface ISong {
    long getId();
    void setId(long value);
    String getName();
    void setName(String value);
    String getArtist();
    void setArtist(String value);
    String getAlbum();
    void setAlbum(String value);
    int getRating();
    void setRating(int value);
    int getYear();
    void setYear(int value);
}

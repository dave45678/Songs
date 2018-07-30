package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Song s = new Song();
        s.setName("1999");
        s.setAlbum("1999");
        s.setArtist("Prince");
        s.setRating(10);

//	    System.out.printf("The song name was %s\n",s.getName());
//	    System.out.printf("The artist name is %s\n",s.getArtist());
//	    System.out.printf("The album name is %s\n",s.getAlbum());
//	    System.out.printf("The rating was %s and the year it came out was %s\n",s.getRating(),s.getYear());
//        System.out.println(s.displaySong());
//


        ArrayList<Song> mySongs = new ArrayList<>();
        mySongs.add(s);

        // Create a new song and add it to the array list
        // so your array list will contain two songs
        Song testsong = new Song();
        testsong.setName("Test Song");
        testsong.setAlbum("Josh's Greatest Hits");
        testsong.setArtist("Josh");
        testsong.setRating(6);

        mySongs.add(testsong);

        // print the two songs in the arraylist
        for (Song oneSong:mySongs){
            System.out.printf("The artist is %s and the album is %s\n",oneSong.getArtist(),oneSong.getAlbum());
        }

    }
}
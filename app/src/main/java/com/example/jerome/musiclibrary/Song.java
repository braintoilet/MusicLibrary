/**
 * Created by jay on 26.03.18.
 */
package com.example.jerome.musiclibrary;

public class Song {
    private String songName;
    private String songAlbum;
    private String songArtist;
    private int songImageID;

    public Song(String name, String album, String artist, int imageID){
        songName = name;
        songAlbum = album;
        songArtist = artist;
        songImageID = imageID;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongAlbum(){
        return songAlbum;
    }

    public String getSongArtist(){
        return songArtist;
    }

    public int getSongImageID(){
        return songImageID;
    }
}

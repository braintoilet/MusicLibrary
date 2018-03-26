package com.example.jerome.musiclibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ArrayList<Song> songList = new ArrayList<Song>();
        for(int i = 1; i <= 10; i++){
            songList.add(new Song("SongName" + i, "Album" + i, "Artist" + i, R.drawable.song_image));
        }
    }
}

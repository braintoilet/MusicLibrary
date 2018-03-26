package com.example.jerome.musiclibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        listView = findViewById(R.id.list);

        ArrayList<Song> songs = getDummySongs(10);
        SongAdapter listAdapter = new SongAdapter(this, getDummySongs(10));
        listView.setAdapter(listAdapter);
    }

    public ArrayList<Song> getDummySongs(int count) {
        ArrayList<Song> songs = new ArrayList<Song>();

        for (int i = 0; i <= count; i++) {
            songs.add(new Song("SongName" + i, "Album" + i, "Artist" + i, R.drawable.song_image));
        }

        return songs;
    }
}

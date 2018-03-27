package com.example.jerome.musiclibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        gridView = findViewById(R.id.list);

        ArrayList<Song> songs = getDummySongs(10);
        SongAdapter listAdapter = new SongAdapter(this, getDummySongs(10));
        gridView.setAdapter(listAdapter);

        //TODO: Set OnItemClickListener on listView -> Intent to SongInfo

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song song = (Song) gridView.getItemAtPosition(position);
                Toast.makeText(getBaseContext(), song.getSongName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public ArrayList<Song> getDummySongs(int count) {
        ArrayList<Song> songs = new ArrayList<Song>();

        for (int i = 0; i <= count; i++) {
            songs.add(new Song("SongName" + i, "Album" + i, "Artist" + i, R.drawable.song_image));
        }

        return songs;
    }
}

package com.example.jerome.musiclibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SongInfoActivity extends AppCompatActivity {

    ImageView songImageView;
    TextView songNameText;
    TextView songArtistText;
    TextView songAlbumText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_info);

        Intent incoming = getIntent();

        if (incoming == null)
            return;

        //get views
        songImageView = findViewById(R.id.song_image);
        songNameText = findViewById(R.id.song_name);
        songArtistText = findViewById(R.id.song_artist);
        songAlbumText = findViewById(R.id.song_album);

        songNameText.setText(incoming.getStringExtra("EXTRA_SONG_NAME"));
        songArtistText.setText(incoming.getStringExtra("EXTRA_ARTIST_NAME"));
        songAlbumText.setText(incoming.getStringExtra("EXTRA_ALBUM_NAME"));
        songImageView.setImageResource(incoming.getIntExtra("EXTRA_SONG_IMAGE", 0));
    }
}

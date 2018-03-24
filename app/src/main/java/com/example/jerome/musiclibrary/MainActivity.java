package com.example.jerome.musiclibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSongs(View view){
        Intent i = new Intent(this, SongsActivity.class);
        startActivity(i);
    }

    public void onClickAlbums(View view){
        Intent i = new Intent(this, SongsActivity.class);
        startActivity(i);
    }

    public void onClickAbout(View view){
        Intent i = new Intent(this, SongsActivity.class);
        startActivity(i);
    }
}

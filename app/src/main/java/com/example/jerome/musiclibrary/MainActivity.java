package com.example.jerome.musiclibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView songsMenu;
    TextView albumsMenu;
    TextView aboutMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songsMenu = (TextView) findViewById(R.id.menu_item_songs);
        albumsMenu = (TextView) findViewById(R.id.menu_item_albums);
        aboutMenu = (TextView) findViewById(R.id.menu_item_about);

        songsMenu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(i);
            }
        });

        albumsMenu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(i);
            }
        });

        aboutMenu.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(i);
            }
        });
    }
}

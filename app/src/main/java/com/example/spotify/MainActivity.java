package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView coverImage;
    MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coverImage = findViewById(R.id.coverimage);

        player = MediaPlayer.create(getApplicationContext(), R.raw.imagination);
    }

    protected void onResume(){
        super.onResume();
    }

    public void play(View view) {

        player.start();
    }
}

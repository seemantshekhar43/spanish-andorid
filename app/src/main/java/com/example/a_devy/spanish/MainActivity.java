package com.example.a_devy.spanish;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // getting the id of each button
    public void playMusic(View view){

        // getting the id of each button
        int id = view.getId();

        // getting corresponding id given by us
        String nameID = view.getResources().getResourceEntryName(id);

        //linking music with button (R.id... type)
        int myMusic = getResources().getIdentifier(nameID,"raw","com.example.a_devy.spanish");

        //creating media player
        MediaPlayer mediaPlayer = MediaPlayer.create(this,myMusic);
        mediaPlayer.start();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

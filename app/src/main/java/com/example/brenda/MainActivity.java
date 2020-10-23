package com.example.brenda;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer media;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv = findViewById(R.id.imageView);

        Glide.with(this).load("https://img.youtube.com/vi/vXF0KKmMN-Q/0.jpg").into(iv);

        media = MediaPlayer.create(getApplicationContext(), R.raw.selvagens);
    }

    public void onResume(View view){

        media.start();
    }
}

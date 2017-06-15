package com.example.raghu.audioplayer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            MediaPlayer mp = new MediaPlayer();




            mp.create(this,R.raw.audio);

                    mp.prepare();
            mp.start();
        } catch (Exception e) {

            Toast.makeText(getApplicationContext(),"CANNOT PLAY",Toast.LENGTH_SHORT).show();
        }
    }
}

package com.example.videoview;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;

// Android Pub Q&A
// http://www.masterqna.com/android/81996/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%8A%A4%ED%8A%9C%EB%94%94%EC%98%A4-videoview-%EA%B4%80%EB%A0%A8

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String fileName = "android.resource://"+  getPackageName() + "/raw/video";

        videoView = (VideoView)findViewById(R.id.videoview);

        videoView.setVideoURI(Uri.parse(fileName));
        videoView.start();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Toast.makeText(MainActivity.this, "End Of Video", Toast.LENGTH_LONG).show();
            }
        });

    }
}

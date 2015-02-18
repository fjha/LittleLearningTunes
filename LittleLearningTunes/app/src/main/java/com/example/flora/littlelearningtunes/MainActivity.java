package com.example.flora.littlelearningtunes;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    Button buttonABC,buttonNumberSong,buttonOpposites,buttonShapes,buttonSounds  ;

    protected   void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        buttonABC= (Button) findViewById(R.id.buttonABC);
        buttonABC.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {
                String youtube_pathABC = "https://www.youtube.com/watch?v=oxIQQS0xYZw";
                Uri uri = Uri.parse(youtube_pathABC);
                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });


        buttonNumberSong= (Button) findViewById(R.id.buttonNumberSong);
        buttonNumberSong.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {
                String youtube_pathNumberSong = "https://www.youtube.com/watch?v=bUwLUTeleqQ";
                Uri uri = Uri.parse(youtube_pathNumberSong);
                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });

        buttonOpposites  = (Button) findViewById(R.id.buttonOpposites  );
        buttonOpposites.setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {
                String youtube_pathNumberSong = "https://www.youtube.com/watch?v=PmoCCFS2eag";
                Uri uri = Uri.parse(youtube_pathNumberSong);
                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });
        buttonSounds  = (Button) findViewById(R.id.buttonSounds  );
        buttonSounds  .setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {
                String youtube_pathNumberSong = "https://www.youtube.com/watch?v=LkMG-ADVS30";
                Uri uri = Uri.parse(youtube_pathNumberSong);
                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });
        buttonShapes    = (Button) findViewById(R.id.buttonShapes    );
        buttonShapes    .setOnClickListener(new View.OnClickListener() {



            public void onClick(View v) {
                String youtube_pathNumberSong = "https://www.youtube.com/watch?v=KvYh1e93BII";
                Uri uri = Uri.parse(youtube_pathNumberSong);
                uri = Uri.parse("vnd.youtube:" + uri.getQueryParameter("v"));
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }

        });




    }



}
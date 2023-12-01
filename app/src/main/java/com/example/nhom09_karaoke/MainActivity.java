package com.example.nhom09_karaoke;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rcSong = (RecyclerView) findViewById(R.id.rcSong);
        SongAdapter adapter = new SongAdapter(Song.getListSong());
        rcSong.setAdapter(adapter);
        rcSong.setLayoutManager(new LinearLayoutManager(this));
    }
}
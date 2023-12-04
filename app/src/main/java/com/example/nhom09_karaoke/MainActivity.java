package com.example.nhom09_karaoke;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static List<Song> listSong = Song.getListSong();
    private RecyclerView rcSong;
    private SongAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcSong = findViewById(R.id.rcSong);
        Intent intent1 = getIntent();
        if (intent1 != null && intent1.hasExtra("textId")) {
            String a = intent1.getStringExtra("textId");
            String b = intent1.getStringExtra("textName");
            String c = intent1.getStringExtra("textLyric");
            String d = intent1.getStringExtra("textSinger");
            Song newSong = new Song(a, b, c, d);
            listSong.add(newSong);
            for (Song song : listSong) {
                Log.d("MainActivity", "Song: " + song.getNameSong());
            }
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        adapter = new SongAdapter(listSong);
        rcSong.setAdapter(adapter);
        rcSong.setLayoutManager(new LinearLayoutManager(this));
    }

    public void addScreen(View view) {
        Intent intent = new Intent(this, addActivity.class);
        startActivity(intent);
    }
    
}
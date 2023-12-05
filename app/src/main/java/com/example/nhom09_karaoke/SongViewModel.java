package com.example.nhom09_karaoke;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class SongViewModel extends ViewModel {
    private MutableLiveData<List<Song>> songList;

    public MutableLiveData<List<Song>> getSongList() {
        if (songList == null) {
            songList = new MutableLiveData<>();
            songList.setValue(Song.getListSong());
        }
        return songList;
    }
    public void addSong(Song song) {
        List<Song> currentList = songList.getValue();
        if (currentList == null) {
            currentList = new ArrayList<>();
        }
        currentList.add(song);
        songList.setValue(currentList);
    }
}

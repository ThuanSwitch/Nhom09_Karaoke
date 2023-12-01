package com.example.nhom09_karaoke;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String maSo;
    private String nameSong;
    private String lyric;
    private String singer;

    public Song(String maSo, String nameSong, String lyric, String singer) {
        this.maSo = maSo;
        this.nameSong = nameSong;
        this.lyric = lyric;
        this.singer = singer;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public static List<Song> getListSong (){
        List<Song> lsSong = new ArrayList<>();
        lsSong.add(new Song("999999","Thất Tình","Anh đã không giữ" +
                " được nhiều hạnh phúc cho em Nhiều khi giận nhau, nước mắt em cứ rơi thật nhiều Anh xin lỗi em, hãy tha thứ cho anh lần này. Đừng rời xa anh, em nói đi, Em rất yêu anh","Trịnh Đình Quang"));
        return  lsSong;
     }
}

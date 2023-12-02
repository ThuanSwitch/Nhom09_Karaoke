package com.example.nhom09_karaoke;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private List<Song> lstSong;

    public SongAdapter(List<Song> lstSong) {
        this.lstSong = lstSong;
    }

    @NonNull
    @Override
    public SongAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View songView = inflater.inflate(R.layout.item_song,parent,false);
        ViewHolder viewHolder = new ViewHolder(songView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.ViewHolder holder, int position) {
        Song temp = lstSong.get(position);
        holder.txtId.setText(temp.getMaSo());
        String a = holder.txtId.getText().toString();
        System.out.println(a);
        holder.txtnameSong.setText(temp.getNameSong());
        holder.txtLyric.setText(temp.getLyric());
        holder.txtAuthor.setText(temp.getSinger());

    }

    @Override
    public int getItemCount() {
        return lstSong.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtId, txtnameSong,txtLyric, txtAuthor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtId = (TextView) itemView.findViewById(R.id.txtIdsong);
            txtnameSong = (TextView) itemView.findViewById(R.id.txtNameSong);
            txtLyric = (TextView) itemView.findViewById(R.id.txtlyric);
            txtAuthor = (TextView) itemView.findViewById(R.id.txtAuthor);
        }
    }
}

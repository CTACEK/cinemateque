package com.ctacekscompany.cinemateque.data;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ctacekscompany.cinemateque.R;

import java.util.List;

public class FilmRecycleAdapter extends RecyclerView.Adapter<FilmRecycleAdapter.ViewHolder> {

    interface OnFilmClickListener {
        void onFilmClick(FilmInfo film, int position);
    }

    private OnFilmClickListener onClickListener;
    private final LayoutInflater inflater;
    private final List<FilmInfo> films;

    public FilmRecycleAdapter(Context context, List<FilmInfo> films, OnFilmClickListener onClickListener) {
        this.onClickListener = onClickListener;
        this.films = films;
        this.inflater = LayoutInflater.from(context);
    }

    public FilmRecycleAdapter(Context context, List<FilmInfo> films) {
        this.films = films;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public FilmRecycleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_film, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FilmRecycleAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        FilmInfo book = films.get(position);
        holder.posterView.setImageResource(book.getPictureResource());
        holder.nameView.setText(book.getName());
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView posterView;
        final TextView nameView;

        ViewHolder(View view) {
            super(view);
            posterView = view.findViewById(R.id.poster);
            nameView = view.findViewById(R.id.name);
        }
    }
}

package com.ctacekscompany.cinemateque.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ctacekscompany.cinemateque.R;

import java.util.List;

public class FilmAdapter extends ArrayAdapter<FilmInfo> {

    private final LayoutInflater inflater;
    private final int layout;
    private final List<FilmInfo> film;
    private Context context;

    public FilmAdapter(Context context, int resource, List<FilmInfo> book) {
        super(context, resource, book);
        this.film = book;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=inflater.inflate(this.layout, parent, false);

        ImageView picView = view.findViewById(R.id.poster);
        TextView nameView = view.findViewById(R.id.name);


        FilmInfo state = film.get(position);

        picView.setImageResource(state.getPictureResource());
        nameView.setText(state.getName());

        return view;
    }
}


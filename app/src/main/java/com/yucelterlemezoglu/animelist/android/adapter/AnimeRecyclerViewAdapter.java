package com.yucelterlemezoglu.animelist.android.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.yucelterlemezoglu.animelist.android.R;
import com.yucelterlemezoglu.animelist.android.model.animeModel.AnimeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YucelT on 27.08.2016.
 */

public class AnimeRecyclerViewAdapter extends RecyclerView.Adapter<AnimeRecyclerViewAdapter.MyViewHolder> {

    private List<AnimeModel> animeModelList = new ArrayList<>();
    private Context mContext;

    public AnimeRecyclerViewAdapter(Context context, List<AnimeModel> animeModelList) {
        this.mContext = context;
        this.animeModelList = animeModelList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTestView, genresTestView;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            titleTestView = (TextView) view.findViewById(R.id.titleTestView);
            genresTestView = (TextView) view.findViewById(R.id.genresTestView);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.anime_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        AnimeModel animeModel = animeModelList.get(position);
        holder.titleTestView.setText(animeModel.anime.titles.romaji);
        holder.genresTestView.setText(animeModel.anime.genres.toString());

        // loading album cover using Glide library
        Glide.with(mContext).load(animeModel.anime.posterImage).into(holder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return animeModelList.size();
    }

}
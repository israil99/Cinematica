package com.example.israil.cinmatica.Adapters;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.israil.cinmatica.MovieDetailsActivity;
import com.example.israil.cinmatica.R;
import com.example.israil.cinmatica.models.Movies.Movies.Result;
import com.example.israil.cinmatica.models.Movies.Movies.Sessions;

import java.util.List;


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private Context mContext;
    private List<Result> mCinemaList;





    public MoviesAdapter(Context mContext, List<Result> mCinemaList) {
        this.mCinemaList = mCinemaList;
        this.mContext = mContext;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MoviesAdapter.MyViewHolder holder, final int position) {
        holder.cinemaNameTextView.setText(mCinemaList.get(position).getName());
        holder.cinemaNameTextView.setTag(mCinemaList.get(position).getId());
        Glide.with(mContext)
                .load(getImageAdres(position))
                .into(holder.imageView);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MovieDetailsActivity.class);
                intent.putExtra("cinemaNames",mCinemaList.get(position).getName());
                intent.putExtra("Image",mCinemaList.get(position).getImage());
                intent.putExtra("Actors",mCinemaList.get(position).getActors());
                intent.putExtra("Countries",mCinemaList.get(position).getCountries());
                intent.putExtra("Rejisser",mCinemaList.get(position).getRejisser());
                intent.putExtra("Vote",mCinemaList.get(position).getVote());
                intent.putExtra("CountOfVotes",mCinemaList.get(position).getCount_vote());
                mContext.startActivity(intent);
            }
        });
    }



    private String getImageAdres(final int position) {
        String url = "http://kinoafisha.ua/"+ mCinemaList.get(position).getImage();
        return url;
    }

    @Override
    public int getItemCount() {
        return mCinemaList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView cinemaNameTextView;
        CardView cardView;
        ImageView imageView;


        public MyViewHolder(final View itemView) {
            super(itemView);

            cinemaNameTextView = (TextView) itemView.findViewById(R.id.textview_cinema_name);
            Toast.makeText(mContext,cinemaNameTextView.getText(),Toast.LENGTH_LONG).show();
            imageView = itemView.findViewById(R.id.cinema_image);
            cardView = itemView.findViewById(R.id.card_view);

        }
    }
}

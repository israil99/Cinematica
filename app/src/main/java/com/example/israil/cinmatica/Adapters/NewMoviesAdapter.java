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

import com.bumptech.glide.Glide;
import com.example.israil.cinmatica.NewMovieDetailsActivity;
import com.example.israil.cinmatica.R;
import com.example.israil.cinmatica.models.Movies.newMovies.NewResult;

import java.util.List;

public class NewMoviesAdapter extends RecyclerView.Adapter<NewMoviesAdapter.MyViewHolder> {




    private Context mContext;
    private List<NewResult> mCinemaList;



    public NewMoviesAdapter(Context mContext, List<NewResult> mCinemaList) {
        this.mCinemaList = mCinemaList;
        this.mContext = mContext;
    }


    @Override
    public NewMoviesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_card, parent, false);
        return new NewMoviesAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final NewMoviesAdapter.MyViewHolder holder, final int position) {
        holder.cinemaNameTextView.setText(mCinemaList.get(position).getName());
        holder.cinemaNameTextView.setTag(mCinemaList.get(position).getId());
        Glide.with(mContext)
                .load(getImageAdres(position))
                .into(holder.imageView);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, NewMovieDetailsActivity.class);
                intent.putExtra("newCinemaNames",mCinemaList.get(position).getName());
                intent.putExtra("newImage",mCinemaList.get(position).getImage());
                intent.putExtra("newActors",mCinemaList.get(position).getActors());
                intent.putExtra("newCountries",mCinemaList.get(position).getCountries());
                intent.putExtra("newRejisser",mCinemaList.get(position).getRejisser());
                intent.putExtra("Comments",mCinemaList.get(position).getComments_count());
                intent.putExtra("Before",mCinemaList.get(position).getBefore());
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
            imageView = itemView.findViewById(R.id.cinema_image);
            cardView = itemView.findViewById(R.id.card_view);

        }
    }
}

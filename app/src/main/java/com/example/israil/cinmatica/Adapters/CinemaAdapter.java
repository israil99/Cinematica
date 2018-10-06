package com.example.israil.cinmatica.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.israil.cinmatica.R;
import com.example.israil.cinmatica.models.Cinemas.Unmain;
import com.example.israil.cinmatica.models.Movies.Movies.Result;

import java.util.List;

public class CinemaAdapter extends RecyclerView.Adapter<CinemaAdapter.MyViewHolder> {

    private Context mContext;
    private List<Unmain> mCinemaList;


    public CinemaAdapter(Context mContext, List<Unmain> mCinemaList) {
        this.mContext = mContext;
        this.mCinemaList = mCinemaList;
    }

    @NonNull
    @Override
    public CinemaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cinema_card, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CinemaAdapter.MyViewHolder holder, int position) {
        holder.cinemaNameTextView.setText(mCinemaList.get(position).getName());
        holder.cinemaNameTextView.setTag(mCinemaList.get(position).getId());
        holder.cinemaAddres.setText(mCinemaList.get(position).getAddress());
        holder.cinemaPhone.setText(mCinemaList.get(position).getPhone());
        Glide.with(mContext)
                .load(getImageAdres(position))
                .into(holder.imageView);
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
        TextView cinemaAddres;
        TextView cinemaPhone;
        CardView cardView;
        ImageView imageView;


        public MyViewHolder(final View itemView) {
            super(itemView);

            cinemaNameTextView = itemView.findViewById(R.id.cinema_name);
            cinemaAddres = itemView.findViewById(R.id.cinema_address);
            cinemaPhone = itemView.findViewById(R.id.cinema_phone);
            imageView = itemView.findViewById(R.id.cinema_img);
            cardView = itemView.findViewById(R.id.cinema_card_view);

        }
    }
}

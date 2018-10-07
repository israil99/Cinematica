package com.example.israil.cinmatica;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.israil.cinmatica.Helper.Helper;

public class MovieDetailsActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private TextView movieActors;
    private TextView movieRejisser;
    private TextView movieCountries;
    private TextView voteTxt;
    private TextView countOfVotesTxt;

    //private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);

        imageView = findViewById(R.id.movie_image);
        textView = findViewById(R.id.movie_name);
        movieActors = findViewById(R.id.movie_description);
        movieRejisser = findViewById(R.id.movie_rejisser);
        movieCountries = findViewById(R.id.movie_countries);
        voteTxt = findViewById(R.id.votes);
        countOfVotesTxt = findViewById(R.id.count_of_votes);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("cinemaNames");
        String image = "http://kinoafisha.ua/"+intent.getExtras().getString("Image");
        String actors = " "+intent.getExtras().getString("Actors");
        String rejisser = " "+intent.getExtras().getString("Rejisser");
        String countries = intent.getExtras().getString("Countries");
        String vote = " "+intent.getExtras().getString("Vote");
        String countVotes = " "+intent.getExtras().getString("CountOfVotes");

        Glide.with(getApplicationContext())
                .load(Helper.makeImageBetter(image))
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(imageView);

        textView.setText(name);
        movieCountries.setText(countries);
        movieActors.setText(Html.fromHtml("<b>"+getString(R.string.actors)+"</b>"+actors));
        movieRejisser.setText(Html.fromHtml("<b>"+getString(R.string.rejisser)+"</b>"+rejisser));
        voteTxt.setText(Html.fromHtml("<b>"+getString(R.string.vote)+"</b>"+vote));
        countOfVotesTxt.setText(Html.fromHtml("<b>"+getString(R.string.countOfVotes)+"</b>"+countVotes));



    }



}


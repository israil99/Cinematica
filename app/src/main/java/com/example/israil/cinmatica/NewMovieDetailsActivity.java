package com.example.israil.cinmatica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.israil.cinmatica.Helper.Helper;

public class NewMovieDetailsActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView newMovieName;
    private TextView newMovieActors;
    private TextView newMovieRejisser;
    private TextView newMovieCountries;
    private TextView beforeTxt;
    private TextView countOfCommentsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_movie_details);

        imageView = findViewById(R.id.new_movie_image);
        newMovieName = findViewById(R.id.new_movie_name);
        newMovieActors = findViewById(R.id.new_movie_actors);
        newMovieRejisser = findViewById(R.id.new_movie_rejisser);
        newMovieCountries = findViewById(R.id.new_movie_countries);
        beforeTxt = findViewById(R.id.before);
        countOfCommentsTxt = findViewById(R.id.count_of_comments);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("newCinemaNames");
        String image = "http://kinoafisha.ua/"+intent.getExtras().getString("newImage");
        String actors = " "+intent.getExtras().getString("newActors");
        String rejisser = " "+intent.getExtras().getString("newRejisser");
        String countries = intent.getExtras().getString("newCountries");
        String comments = " "+intent.getExtras().getString("Comments");
        String before = " "+intent.getExtras().getString("Before");

        Glide.with(getApplicationContext())
                .load(Helper.makeImageBetter(image))
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .skipMemoryCache(true)
                .into(imageView);
        newMovieName.setText(name);
        newMovieCountries.setText(countries);
        newMovieActors.setText(Html.fromHtml("<b>"+getString(R.string.actors)+"</b>"+actors));
        newMovieRejisser.setText(Html.fromHtml("<b>"+getString(R.string.rejisser)+"</b>"+rejisser));
        countOfCommentsTxt.setText(Html.fromHtml("<b>"+getString(R.string.CountOfComments)+"</b>"+comments));
        beforeTxt.setText(Html.fromHtml("<b>"+getString(R.string.before)+"</b>"+before));

    }
}

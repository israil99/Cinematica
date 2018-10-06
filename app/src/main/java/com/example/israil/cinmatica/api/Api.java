package com.example.israil.cinmatica.api;
import com.example.israil.cinmatica.models.Cinemas.Cinemas;
import com.example.israil.cinmatica.models.Movies.Movies.Main;
import com.example.israil.cinmatica.models.Movies.newMovies.Movies;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("/ajax/kinoafisha_load/")
    Call<Main> readCinemaArray();



    @GET("/ajax/skoro_load")
    Call<Movies>readNewMoviesList();


    @GET("/ajax/kinoteatrs_load")
    Call<Cinemas>readCinemaList();


}


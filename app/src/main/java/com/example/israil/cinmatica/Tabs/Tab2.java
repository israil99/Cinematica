package com.example.israil.cinmatica.Tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.israil.cinmatica.Adapters.NewMoviesAdapter;
import com.example.israil.cinmatica.R;


import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.israil.cinmatica.api.Api;
import com.example.israil.cinmatica.api.RetrofitClientInstance;
import com.example.israil.cinmatica.models.Movies.newMovies.Movies;
import com.example.israil.cinmatica.models.Movies.newMovies.NewResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab2 extends Fragment {

    private RecyclerView recyclerView;
    private NewMoviesAdapter cinemaAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2_context, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view2);
        GridLayoutManager manager = new GridLayoutManager(getActivity(), 3);
        recyclerView.setLayoutManager(manager);
        //recyclerView.setAdapter(cinemaAdapter);
        getNewResult();

        return rootView;
    }

/*
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }
    */
    public void getNewResult(){

        final Api service = RetrofitClientInstance.getRetrofitInstance().create(Api.class);
        Call<Movies> call = service.readNewMoviesList();
        call.enqueue(new Callback<Movies>() {
            @Override
            public void onResponse(Call<Movies> call, Response<Movies> response) {
                List<NewResult>listOfMovies = response.body().getResult();
                Log.d("COUNT","Count :"+listOfMovies.size());

                cinemaAdapter = new NewMoviesAdapter(getActivity(),listOfMovies);
                recyclerView.setAdapter(cinemaAdapter);
            }

            @Override
            public void onFailure(Call<Movies> call, Throwable t) {

            }
        });
    }
}
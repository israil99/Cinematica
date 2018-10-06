package com.example.israil.cinmatica.Tabs;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.israil.cinmatica.Adapters.MoviesAdapter;
import com.example.israil.cinmatica.R;
import com.example.israil.cinmatica.api.Api;
import com.example.israil.cinmatica.api.RetrofitClientInstance;
import com.example.israil.cinmatica.models.Movies.Movies.Main;
import com.example.israil.cinmatica.models.Movies.Movies.Result;
import com.example.israil.cinmatica.models.Movies.Movies.Sessions;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab1 extends Fragment {

    private RecyclerView recyclerView;
    private MoviesAdapter moviesAdapter;
    private MoviesAdapter moviesAdapter1;
    private List<Sessions>sessions;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1_context, container,false);
        recyclerView = rootView.findViewById(R.id.recycler_view);
        GridLayoutManager manager = new GridLayoutManager(getActivity(),3);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(moviesAdapter);


        return rootView;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final Api service = RetrofitClientInstance.getRetrofitInstance().create(Api.class);
        Call<Main> call = service.readCinemaArray();
        call.enqueue(new Callback<Main>() {
            @Override
            public void onResponse(Call<Main> call, Response<Main> response) {
                List<Result> result = response.body().getResult();
                Log.d("COUNT","Count :"+result.size());



                moviesAdapter = new MoviesAdapter(getActivity(),result);
                recyclerView.setAdapter(moviesAdapter);


            }

            @Override
            public void onFailure(Call<Main> call, Throwable t) {

            }
        });


    }
}



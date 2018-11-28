package com.example.israil.cinmatica.Tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.israil.cinmatica.Adapters.CinemaAdapter;
import com.example.israil.cinmatica.Adapters.MoviesAdapter;
import com.example.israil.cinmatica.R;
import com.example.israil.cinmatica.api.Api;
import com.example.israil.cinmatica.api.RetrofitClientInstance;
import com.example.israil.cinmatica.models.Cinemas.Cinemas;
import com.example.israil.cinmatica.models.Cinemas.ResultCinema;
import com.example.israil.cinmatica.models.Cinemas.Unmain;
import com.example.israil.cinmatica.models.Movies.Movies.Main;
import com.example.israil.cinmatica.models.Movies.Movies.Result;
import com.example.israil.cinmatica.models.Movies.Movies.Sessions;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Tab3 extends Fragment {

    private RecyclerView recyclerView;
    private CinemaAdapter cinemaAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3_context, container, false);
        recyclerView = rootView.findViewById(R.id.recycler_view3);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);
        //recyclerView.setAdapter(cinemaAdapter);
        getUnmain();

        return rootView;
    }


    public void getUnmain() {
            final Api service = RetrofitClientInstance.getRetrofitInstance().create(Api.class);
            Call<Cinemas> call = service.readCinemaList();
                call.enqueue(new Callback<Cinemas>()

            {
                @Override
                public void onResponse (Call < Cinemas > call, Response < Cinemas > response){

                List<Unmain> unmain = response.body().getResult().getUnmain();
                Log.d("Cinema", "" + unmain.size());

                cinemaAdapter = new CinemaAdapter(getActivity(), unmain);
                recyclerView.setAdapter(cinemaAdapter);
            }

                @Override
                public void onFailure (Call < Cinemas > call, Throwable t){

            }
            });
}

 /*   @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }*/
}

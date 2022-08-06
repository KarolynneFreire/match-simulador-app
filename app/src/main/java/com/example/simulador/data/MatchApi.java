package com.example.simulador.data;


import com.example.simulador.domain.Match;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchApi {

    @GET("match.json")
    Call<List<Match>> getMatches();

}

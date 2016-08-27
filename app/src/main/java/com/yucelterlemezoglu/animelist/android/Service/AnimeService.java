package com.yucelterlemezoglu.animelist.android.service;

import com.yucelterlemezoglu.animelist.android.model.animeModel.AnimeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by YucelT on 25.08.2016.
 */
public interface AnimeService {
    @GET("api/v2X/anime/{id}")
    Call<List<AnimeModel>> listAnime(@Path("id") int animeId,
            @Query("X-Client-Id") String ACCESS_KEY);
}

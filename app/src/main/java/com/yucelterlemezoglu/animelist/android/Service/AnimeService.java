package com.yucelterlemezoglu.animelist.android.Service;

import com.yucelterlemezoglu.animelist.android.Model.AnimeModel.AnimeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by YucelT on 25.08.2016.
 */
public interface AnimeService {
    @GET("api/v2X/anime/{id}")
    Call<List<AnimeModel>> listAnime(
            @Query("X-Client-Id") String ACCESS_KEY);
}

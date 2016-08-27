package com.yucelterlemezoglu.animelist.android.service;

import com.yucelterlemezoglu.animelist.android.model.animeModel.AnimeModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by YucelT on 25.08.2016.
 */
public interface AnimeService {
    @Headers("X-Client-Id:94d48e8fbb231f6eeff9")
    @GET("api/v2/anime/{id}")
    Call<AnimeModel> listAnime(@Path("id") int animeId);
}

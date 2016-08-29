package com.yucelterlemezoglu.animelist.android.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by YucelT on 28.08.2016.
 */
public class AnimeClient {

    public static String BASE_URL = "https://hummingbird.me/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        System.out.println();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}

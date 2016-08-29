package com.yucelterlemezoglu.animelist.android;

import android.util.Log;

import com.yucelterlemezoglu.animelist.android.model.animeModel.AnimeModel;
import com.yucelterlemezoglu.animelist.android.service.AnimeClient;
import com.yucelterlemezoglu.animelist.android.service.AnimeService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by YucelT on 29.08.2016.
 */
public class AnimeModelToList {

    private static List<AnimeModel> animeModels = new ArrayList<>();

    public static List<AnimeModel> animeModelList() {

        AnimeService animeService = AnimeClient.getClient().create(AnimeService.class);
        for (int i = 0; i < 20; i++) {



            Call<AnimeModel> call = animeService.animeDetail((int)(Math.random()*12515));

            call.enqueue(new Callback<AnimeModel>() {
                @Override
                public void onResponse(Call<AnimeModel> call, Response<AnimeModel> response) {
                    if (response.isSuccessful()) {

                        animeModels.add(response.body());

                        try {
                            Log.v("TEST", "Name : " + response.body().anime.titles.romaji);
                        } catch (Exception e) {
                            Log.e("TEST", "Error : " + e.toString());
                        }
                    }
                }

                @Override
                public void onFailure(Call<AnimeModel> call, Throwable t) {
                    Log.v("TEST", "fail : " + t.getLocalizedMessage());
                }
            });
        }

        return animeModels;
    }


}

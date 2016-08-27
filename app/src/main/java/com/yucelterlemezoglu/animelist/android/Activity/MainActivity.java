package com.yucelterlemezoglu.animelist.android.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.yucelterlemezoglu.animelist.android.AssetsPropertyReader;
import com.yucelterlemezoglu.animelist.android.model.animeModel.AnimeModel;
import com.yucelterlemezoglu.animelist.android.R;
import com.yucelterlemezoglu.animelist.android.service.AnimeService;

import java.util.Properties;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private AssetsPropertyReader assetsPropertyReader;
    private Context context;
    private Properties properties;

    String BASE_URL = "https://hummingbird.me/";
    String ACCESS_KEY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        assetsPropertyReader = new AssetsPropertyReader(context);
        properties = assetsPropertyReader.getProperties("services.properties");

        ACCESS_KEY = properties.getProperty("ACCESS_KEY");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AnimeService animeService = retrofit.create(AnimeService.class);

        Call<AnimeModel> call = animeService.listAnime(11);

        call.enqueue(new Callback<AnimeModel>() {
            @Override
            public void onResponse(Call<AnimeModel> call, Response<AnimeModel> response) {
                if (response.isSuccessful()) {

                    Log.v("TEST", "Name : " + response.body().anime.titles.romaji);
                    Log.v("TEST", "Slug : " + response.body().anime.slug);
                    Log.v("TEST", "Image : " + response.body().anime.posterImage);
                    Log.v("TEST", "Genres : " + response.body().anime.genres);
                }

            }

            @Override
            public void onFailure(Call<AnimeModel> call, Throwable t) {
                Log.v("TEST", "fail : " + t.getLocalizedMessage());
            }
        });
    }
}

package com.yucelterlemezoglu.animelist.android.Activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.yucelterlemezoglu.animelist.android.AssetsPropertyReader;
import com.yucelterlemezoglu.animelist.android.Model.AnimeModel.Anime;
import com.yucelterlemezoglu.animelist.android.Model.AnimeModel.AnimeModel;
import com.yucelterlemezoglu.animelist.android.R;
import com.yucelterlemezoglu.animelist.android.Service.AnimeService;

import java.util.List;
import java.util.Properties;

import retrofit2.Call;
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
        Log.v("ACCESS_KEY", "index=" + ACCESS_KEY);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        AnimeService service = retrofit.create(AnimeService.class);

        Call<List<AnimeModel>> animeList = service.listAnime(ACCESS_KEY);

        Log.v("AnimeModelList", "index=" + animeList);

    }
}

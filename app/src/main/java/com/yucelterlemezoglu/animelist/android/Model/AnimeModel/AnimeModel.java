
package com.yucelterlemezoglu.animelist.android.Model.AnimeModel;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AnimeModel {

    @SerializedName("anime")
    @Expose
    public Anime anime;
    @SerializedName("linked")
    @Expose
    public Linked linked;

}
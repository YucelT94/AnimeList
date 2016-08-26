
package com.yucelterlemezoglu.animelist.android.Model.AnimeModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Titles {

    @SerializedName("canonical")
    @Expose
    public String canonical;
    @SerializedName("english")
    @Expose
    public String english;
    @SerializedName("romaji")
    @Expose
    public String romaji;
    @SerializedName("japanese")
    @Expose
    public String japanese;

}

package com.yucelterlemezoglu.animelist.android.model.animeModel;

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
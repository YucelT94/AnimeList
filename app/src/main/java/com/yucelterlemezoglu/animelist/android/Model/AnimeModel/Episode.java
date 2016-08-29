
package com.yucelterlemezoglu.animelist.android.model.animeModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Episode {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("synopsis")
    @Expose
    public Object synopsis;
    @SerializedName("airdate")
    @Expose
    public Object airdate;
    @SerializedName("number")
    @Expose
    public Integer number;
    @SerializedName("season_number")
    @Expose
    public Object seasonNumber;

}

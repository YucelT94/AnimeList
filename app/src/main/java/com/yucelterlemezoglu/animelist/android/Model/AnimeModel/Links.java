
package com.yucelterlemezoglu.animelist.android.model.animeModel;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("gallery_images")
    @Expose
    public List<Integer> galleryImages = new ArrayList<Integer>();
    @SerializedName("episodes")
    @Expose
    public List<Integer> episodes = new ArrayList<Integer>();

}
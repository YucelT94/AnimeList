
package com.yucelterlemezoglu.animelist.android.model.animeModel;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Linked {

    @SerializedName("gallery_images")
    @Expose
    public List<GalleryImage> galleryImages = new ArrayList<GalleryImage>();
    @SerializedName("episodes")
    @Expose
    public List<Episode> episodes = new ArrayList<Episode>();

}
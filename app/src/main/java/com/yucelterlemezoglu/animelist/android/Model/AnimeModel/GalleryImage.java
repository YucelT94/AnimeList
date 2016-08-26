
package com.yucelterlemezoglu.animelist.android.Model.AnimeModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GalleryImage {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("thumb")
    @Expose
    public String thumb;
    @SerializedName("original")
    @Expose
    public String original;

}
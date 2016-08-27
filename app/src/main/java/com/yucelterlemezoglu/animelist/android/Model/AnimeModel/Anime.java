
package com.yucelterlemezoglu.animelist.android.model.animeModel;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Anime {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("titles")
    @Expose
    public Titles titles;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("synopsis")
    @Expose
    public String synopsis;
    @SerializedName("started_airing_date")
    @Expose
    public String startedAiringDate;
    @SerializedName("finished_airing_date")
    @Expose
    public String finishedAiringDate;
    @SerializedName("youtube_video_id")
    @Expose
    public String youtubeVideoId;
    @SerializedName("age_rating")
    @Expose
    public String ageRating;
    @SerializedName("episode_count")
    @Expose
    public Integer episodeCount;
    @SerializedName("episode_length")
    @Expose
    public Integer episodeLength;
    @SerializedName("show_type")
    @Expose
    public String showType;
    @SerializedName("poster_image")
    @Expose
    public String posterImage;
    @SerializedName("cover_image")
    @Expose
    public String coverImage;
    @SerializedName("community_rating")
    @Expose
    public Float communityRating;
    @SerializedName("genres")
    @Expose
    public List<String> genres = new ArrayList<String>();
    @SerializedName("producers")
    @Expose
    public List<String> producers = new ArrayList<String>();
    @SerializedName("bayesian_rating")
    @Expose
    public Float bayesianRating;
    @SerializedName("links")
    @Expose
    public Links links;

}


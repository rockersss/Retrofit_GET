package com.example.retrofit_get;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;
    private int jobid;
    @SerializedName("rating")
    private int rating;

    public int getUserId() {
        return userId;
    }

    public int getJobid() {
        return jobid;
    }

    public int getRating() {
        return rating;
    }
}

package com.example.retrofit_get;

import com.google.gson.annotations.SerializedName;

public class Post {
    private int userId;
    private int jobId;
    @SerializedName("rating")
    private int rating;

    public int getUserId() {
        return userId;
    }

    public int getJobId() {
        return jobId;
    }

    public int getRating() {
        return rating;
    }
}

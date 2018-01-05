package com.example.bittu.jaipur;


public class Place {

    private String mTitle;

    private String mDescription;

    private int mImageResourceId;


    public Place(String title, String description, int imageResouceId) {
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResouceId;

    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

}

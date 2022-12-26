package com.example.android.tourguideapp;

public class Attraction {

    private int mImageResourceId;
    private String mAttractionName;
    private String mAddress;
    private String mDescription;


    public Attraction(String attractionName, String description, int imageId) {
        mAttractionName = attractionName;
        mDescription = description;
        //mAddress = address;
        mImageResourceId = imageId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmAttractionName() {
        return mAttractionName;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmDescription() {
        return mDescription;
    }
}

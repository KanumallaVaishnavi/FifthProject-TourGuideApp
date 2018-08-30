package com.example.kalyani.tourguideapp;

class Location {
    private int mImageResourceId;
    private int mNameStringId;
    private int mAddressStringId;
    private int mTimingsStringId;
    private int mAudioResourceId;

    Location(int mImageResourceId, int mNameStringId, int mAddressStringId, int mTimingsStringId, int mAudioResourceId) {
        this.mImageResourceId = mImageResourceId;
        this.mNameStringId = mNameStringId;
        this.mAddressStringId = mAddressStringId;
        this.mTimingsStringId = mTimingsStringId;
        this.mAudioResourceId = mAudioResourceId;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    int getNameStringId() {
        return mNameStringId;
    }

    int getAddressStringId() {
        return mAddressStringId;
    }

    int getmTimingsStringId() { return mTimingsStringId; }

    int getAudioResourceId() {
        return mAudioResourceId;
    }
}
package com.example.android.miwok;

/**
 * Created by tav on 04/02/2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;

    private int mMediaPlayerId;

    private int mImageView = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int mediaPlayer){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMediaPlayerId = mediaPlayer;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imageIcon, int mediaPlayer){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageView = imageIcon;
        mMediaPlayerId = mediaPlayer;

    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageIcon(){
        return mImageView;
    }

    public boolean hasImage(){
        return mImageView != NO_IMAGE_PROVIDED;
    }

    public int getMediaPlayer(){
        return mMediaPlayerId;
    }

}

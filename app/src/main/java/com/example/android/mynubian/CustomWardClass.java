package com.example.android.mynubian;

import android.text.style.BackgroundColorSpan;

public class CustomWardClass {
    private  String nubianWards;
    private int defaultWards;
    private  int imageRes;
    private final int checkImage=0;
    private int audioRes;



    CustomWardClass(String mnubianTranslation,int mdefaultTranslation,int mimageRes,int maudioRes){
        nubianWards =mnubianTranslation;
        defaultWards =mdefaultTranslation;
        imageRes= mimageRes;
        audioRes=maudioRes;
    }
    CustomWardClass(String mnubianTranslation,int mdefaultTranslation,int maudioRes){
        nubianWards =mnubianTranslation;
        defaultWards =mdefaultTranslation;
        audioRes=maudioRes;
    }
    public String getNubianTranslation(){
        return nubianWards;
    }
    public int getDefaultTranslation(){
        return defaultWards;
    }
    public int getAudioRes(){
        return audioRes;
    }
    public int getImageRes(){
        return imageRes;
    }
    public boolean hasImage(){

        return imageRes!= checkImage;
    }


}

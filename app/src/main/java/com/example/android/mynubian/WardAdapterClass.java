package com.example.android.mynubian;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v13.view.inputmethod.InputConnectionCompat;
import android.support.v4.content.ContextCompat;
import android.transition.Visibility;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WardAdapterClass extends ArrayAdapter< CustomWardClass> {
    int colorResId;
    MediaPlayer mMediaPlayer;
    AudioManager mAudioManager;



    public WardAdapterClass( Context context, int resource,  List objects,int  resColor) {
        super(context, 0, objects);
        colorResId=resColor;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)  {


        View listItemView = convertView;
        if(listItemView == null) {
            LayoutInflater inflater=LayoutInflater.from(getContext());
            listItemView =inflater.inflate(R.layout.custom_list_item, parent, false);
        }

        final CustomWardClass getWards = getItem(position);

//set back correct nubain translate  for each activity
        TextView nubianTextView = (TextView) listItemView.findViewById(R.id.nubian_ward);
        nubianTextView.setText(getWards.getNubianTranslation());

//set back correct default translate  for each activity
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_translation);
        defaultTextView .setText(getWards.getDefaultTranslation());

//set back correct images  for each activity
        ImageView setImage =(ImageView) listItemView.findViewById(R.id.image_res);
        if(getWards.hasImage()){
        setImage.setImageResource(getWards.getImageRes());
        setImage.setVisibility(View.VISIBLE);}
        else {setImage.setVisibility(View.GONE);
        }

        //set back ground color for each activity
        View getColor =(View) listItemView.findViewById(R.id.back_color);
        int color = ContextCompat.getColor(getContext(), colorResId);
        getColor.setBackgroundColor(color);

//set back media file for each activity
       ImageView setAudio =listItemView.findViewById(R.id.audio_res);
        setAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                releaseMediaPlayer();

                mMediaPlayer = MediaPlayer.create(getContext(), getWards.getAudioRes());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        releaseMediaPlayer();
                    }
                });

            }
        });


        return listItemView ;
    }
    /**
     * Clean up the media player by releasing its resources.
     */

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;

        }
    }
}

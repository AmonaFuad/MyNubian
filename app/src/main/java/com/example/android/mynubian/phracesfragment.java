package com.example.android.mynubian;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class phracesfragment extends Fragment {


    public phracesfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View rootView =inflater.inflate(R.layout.word_list, container, false);
        ArrayList <CustomWardClass> words =new ArrayList <>();

        words.add(new CustomWardClass("ier hiakurfi ", R.string.phrase1,R.raw.number_ninee));
        words.add(new CustomWardClass("maska'agrow", R.string.phrase2,R.raw.number_ninee));
        words.add(new CustomWardClass("ayka nayina", R.string.phrase3,R.raw.number_ninee));
        words.add(new CustomWardClass("ayga ..... iigenna", R.string.phrase4,R.raw.number_ninee));
        words.add(new CustomWardClass("ier hakyna", R.string.phrase5,R.raw.number_ninee));
        words.add(new CustomWardClass("ayyu hakil", R.string.phrase6,R.raw.number_ninee));
        words.add(new CustomWardClass("yala hanugajilon", R.string.phrase7,R.raw.number_ninee));
        words.add(new CustomWardClass("inndu kery", R.string.phrase8,R.raw.number_ninee));
        words.add(new CustomWardClass("amnga aker", R.string.phrase9,R.raw.number_ninee));

        WardAdapterClass adapter =new WardAdapterClass(getActivity(), R.layout.custom_list_item, words,R.color.phresesColor);
        ListView listView = (ListView) rootView.findViewById(R.id.List_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}

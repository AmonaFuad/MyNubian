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
public class NumbersFragment extends Fragment {


    public NumbersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /** TODO: Insert all the code from the NumberActivity’s onCreate() method after the setContentView method call */
        ArrayList <CustomWardClass> words =new ArrayList <>();

        words.add(new CustomWardClass(" wira", R.string.number_one,R.drawable.number_one,R.raw.sleepawy));
        words.add(new CustomWardClass("aw'ow", R.string.number_two,R.drawable.number_two,R.raw.number_twoo));
        words.add(new CustomWardClass("tiscow", R.string.number_three,R.drawable.number_three,R.raw.number_threee));
        words.add(new CustomWardClass("kimso", R.string.number_four,R.drawable.number_four,R.raw.number_fourr));
        words.add(new CustomWardClass("dija", R.string.number_five,R.drawable.number_five,R.raw.number_fivee));
        words.add(new CustomWardClass("gorjow", R.string.number_six,R.drawable.number_six,R.raw.number_sixx));
        words.add(new CustomWardClass("kawluda", R.string.number_seven,R.drawable.number_seven,R.raw.number_sevenn));
        words.add(new CustomWardClass("edway", R.string.number_eight,R.drawable.number_eight,R.raw.number_eightt));
        words.add(new CustomWardClass("oscoda", R.string.number_nine,R.drawable.number_nine,R.raw.number_ninee));
        words.add(new CustomWardClass("demay", R.string.number_ten,R.drawable.number_ten,R.raw.numer_tenn));


        WardAdapterClass adapter =new WardAdapterClass(getActivity(), R.layout.custom_list_item, words,R.color.numerColor);
        ListView listView = (ListView)rootView.findViewById(R.id.List_view);

        listView.setAdapter(adapter);


        return rootView;

    }

}

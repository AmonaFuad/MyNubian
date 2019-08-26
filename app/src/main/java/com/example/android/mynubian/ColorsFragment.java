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
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList <CustomWardClass> words =new ArrayList <>();

        words.add(new CustomWardClass(" awrum", R.string.color_black,R.drawable.color_black,R.raw.sleepawy));
        words.add(new CustomWardClass("nowlu", R.string.color_whit,R.drawable.color_white,R.raw.number_ninee));
        words.add(new CustomWardClass("gail", R.string.color_red,R.drawable.color_red,R.raw.number_ninee));
        words.add(new CustomWardClass("gumray", R.string.color_yellow,R.drawable.color_mustard_yellow,R.raw.number_ninee));
        words.add(new CustomWardClass("nabri", R.string.color_tan,R.drawable.color_brown,R.raw.number_ninee));
        words.add(new CustomWardClass("gummetar", R.string.color_orange,R.drawable.color_dusty_yellow,R.raw.number_ninee));
        words.add(new CustomWardClass("shoor", R.string.color_gray,R.drawable.color_gray,R.raw.number_ninee));
        words.add(new CustomWardClass("dissy", R.string.color_green,R.drawable.color_green,R.raw.number_ninee));


        WardAdapterClass adapter =new WardAdapterClass(getActivity(), R.layout.custom_list_item, words,R.color.colorColor);
        ListView listView = (ListView) rootView.findViewById(R.id.List_view);

        listView.setAdapter(adapter);

        return rootView;
    }

}

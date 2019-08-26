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
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList <CustomWardClass> words =new ArrayList <>();

        words.add(new CustomWardClass(" abou", R.string.fhather_name,R.drawable.family_father,R.raw.number_ninee));
        words.add(new CustomWardClass("anain", R.string.mother_name,R.drawable.family_mother,R.raw.number_ninee));
        words.add(new CustomWardClass("anniga dawey", R.string.older_brother,R.drawable.family_older_brother,R.raw.number_ninee));
        words.add(new CustomWardClass("annesy dawey", R.string.older_sister,R.drawable.family_older_sister,R.raw.number_ninee));
        words.add(new CustomWardClass("anniga kodood", R.string.younger_brother,R.drawable.family_younger_brother,R.raw.number_ninee));
        words.add(new CustomWardClass("anesy kodood", R.string.younger_sister,R.drawable.family_younger_sister,R.raw.number_ninee));
        words.add(new CustomWardClass("annow", R.string.grand_father,R.drawable.family_grandfather,R.raw.number_ninee));
        words.add(new CustomWardClass("annaow", R.string.grand_mother,R.drawable.family_grandmother,R.raw.number_ninee));
        words.add(new CustomWardClass("angaa", R.string.son,R.drawable.family_son,R.raw.number_ninee));
        words.add(new CustomWardClass("annass", R.string.daughter,R.drawable.family_daughter,R.raw.number_ninee));


        WardAdapterClass adapter =new WardAdapterClass(getActivity(), R.layout.custom_list_item, words,R.color.familyColor);
        ListView listView = (ListView) rootView.findViewById(R.id.List_view);

        listView.setAdapter(adapter);


        return rootView;
    }

}

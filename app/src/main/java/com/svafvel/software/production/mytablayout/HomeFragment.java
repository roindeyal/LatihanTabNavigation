package com.svafvel.software.production.mytablayout;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section number";

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(int index){
        HomeFragment fragment = new HomeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return  fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@Nullable View view, @Nullable Bundle savedInstanceState){

        super.onViewCreated(view, savedInstanceState);
        final TextView textView = view.findViewById(R.id.section_label);

        int index = 1;
        if(getArguments() != null){
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }

        textView.setText(getString(R.string.content_tab_text) + " " + index);

    }

}

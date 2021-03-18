package com.example.unicodelibraryapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class UnpaidFineFragment extends Fragment {



    public UnpaidFineFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
        RecyclerView unpaid_recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =inflater.inflate(R.layout.fragment_unpaid_fine, container, false);
        unpaid_recyclerView = v.findViewById(R.id.unpaid_recycler_view);
//        PagerAdapter  pagerAdapter =new PagerAdapter();

        return v;
    }
}
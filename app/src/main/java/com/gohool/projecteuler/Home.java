package com.gohool.projecteuler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Model.Listitem;
import Model.homeAdapter;

public class Home extends Fragment {

    private RecyclerView recyclerView;
    private homeAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        ArrayList<Listitem> listItems = new ArrayList<>();
        buildRecyclerView(listItems, v);
        return v;
    }

    public void buildRecyclerView(ArrayList<Listitem> listItems, View v) {
        listItems = new ArrayList<>();
        Listitem listitem = new Listitem(R.drawable.app_image_1, R.drawable.baseline_account_circle_black_18dp,50, 15, "Rohan Sadhukhan", "Jun 20, 2020", "I am a fuckboy");
        listItems.add(listitem);
        listitem = new Listitem(R.drawable.app_image_2, R.drawable.baseline_account_circle_black_18dp,50, 15, "Bhuvan Bam", "Jun 20, 2020", "pok pok");
        listItems.add(listitem);
        listitem = new Listitem(R.drawable.app_image_3, R.drawable.baseline_account_circle_black_18dp,50, 15, "China Teri Maa ki Chut", "Jun 20, 2020", "Made In China, Fucked by India");
        listItems.add(listitem);

        recyclerView = v.findViewById(R.id.homeRecyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new homeAdapter(listItems);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }




}
package com.gohool.projecteuler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import Model.*;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<Listitem> listItems;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItems = new ArrayList<Listitem>();

        Listitem listitem = new Listitem(R.drawable.app_image_1, R.drawable.baseline_account_circle_black_18dp,50, 15, "Rohan Sadhukhan", "Jun 20, 2020", "I am a fuckboy");
        listItems.add(listitem);
        listitem = new Listitem(R.drawable.app_image_2, R.drawable.baseline_account_circle_black_18dp,50, 15, "Bhuvan Bam", "Jun 20, 2020", "pok pok");
        listItems.add(listitem);
        listitem = new Listitem(R.drawable.app_image_3, R.drawable.baseline_account_circle_black_18dp,50, 15, "China Teri Maa ki Chut", "Jun 20, 2020", "Made In China, Fucked by India");
        listItems.add(listitem);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


//        for(int i = 0; i < 10; i++) {
//            listitem = new Listitem();
//            listItems.add(listitem);
//        }

        adapter = new myAdaper(this, listItems);
        recyclerView.setAdapter(adapter);
    }
}
package com.ytl.androidrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static int NUM_LIST_ITEMS = 100;
    GreenAdapter mAdapter;
    RecyclerView mNumbersList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumbersList = findViewById(R.id.rv_itemLayout);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        mNumbersList.setLayoutManager(layoutManager);

        mNumbersList.setHasFixedSize(true);

        mAdapter = new GreenAdapter(NUM_LIST_ITEMS);

        mNumbersList.setAdapter(mAdapter);
    }


}

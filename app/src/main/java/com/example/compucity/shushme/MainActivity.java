package com.example.compucity.shushme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private PlaceListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecycleView=(RecyclerView)findViewById(R.id.places_list_recycler_view);
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter=new PlaceListAdapter(this);
        mRecycleView.setAdapter(mAdapter);
    }
}

package com.google.distlergrace.original;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;

    String[] s1;
    String[] s2;
    int[] images = {R.drawable.labrador, R.drawable.german_shepherd, R.drawable.rottweiler,
                    R.drawable.golden_retriever, R.drawable.chow_chow, R.drawable.bernese_mountain,
                    R.drawable.saint_bernard, R.drawable.dalmatian, R.drawable.pyrenees
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.dog_breeds);
        s2 = getResources().getStringArray(R.array.dog_breed_description);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

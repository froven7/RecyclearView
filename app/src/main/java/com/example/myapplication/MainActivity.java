package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.hardware.lights.LightState;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.main_container);
        recyclerView.setHasFixedSize(true);

        List<Photos> mList=new ArrayList<>();
        mList.add(new Photos(R.drawable.image_1));
        mList.add(new Photos(R.drawable.image_2));
        mList.add(new Photos(R.drawable.image_3));
        mList.add(new Photos(R.drawable.image_4));
        mList.add(new Photos(R.drawable.image_2));
        mList.add(new Photos(R.drawable.image_3));
        mList.add(new Photos(R.drawable.image_1));
        mList.add(new Photos(R.drawable.image_4));
        mList.add(new Photos(R.drawable.image_3));
        mList.add(new Photos(R.drawable.image_2));
        mList.add(new Photos(R.drawable.image_1));

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        PhotosAdapter adapter=new PhotosAdapter(mList);
        recyclerView.setAdapter(adapter);


    }
}
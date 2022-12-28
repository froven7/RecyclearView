package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.hardware.lights.LightState;
import android.os.Bundle;
import android.service.controls.actions.FloatAction;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab=findViewById(R.id.floatActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CameraActivity.class));
            }
        });

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
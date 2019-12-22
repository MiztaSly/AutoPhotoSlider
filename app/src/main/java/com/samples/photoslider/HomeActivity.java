package com.samples.photoslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private List<Slide> slide1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);

        //list of slides
        slide1 = new ArrayList<>();
        slide1.add(new Slide(R.drawable.slidebest,"Best Movies of 2018"));
        slide1.add(new Slide(R.drawable.slidehd,"Best Movies of 2018"));
        slide1.add(new Slide(R.drawable.slidejwick,"Best Movies of 2018"));
        slide1.add(new Slide(R.drawable.slidebest,"Best Movies of 2018"));


    }
}

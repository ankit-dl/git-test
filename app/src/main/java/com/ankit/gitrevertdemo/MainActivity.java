package com.ankit.gitrevertdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentController;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String F_TAG = "Thakur";
    String TAG = "Ankit";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("changes", "second  commit changes");
        Log.i("changes", "third  commit changes");
        Log.i("changes", "first  commit changes - otherbranch");
        Log.i(F_TAG, "first  commit changes - by Friend");


    }
}
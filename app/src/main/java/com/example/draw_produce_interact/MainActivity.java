package com.example.draw_produce_interact;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private GLSurfaceView gLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create a GLSurfaceView Instance and set it as ContentView for Activity
        gLView = new MyGLSurfaceView(this);
        setContentView(gLView);
        // setContentView(R.layout.activity_main);
    }
}


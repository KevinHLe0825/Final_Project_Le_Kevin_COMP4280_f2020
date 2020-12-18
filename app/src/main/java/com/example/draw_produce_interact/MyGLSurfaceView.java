package com.example.draw_produce_interact;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {

    private final MyGLRenderer renderer;

    public MyGLSurfaceView(Context context) {
     super(context);

     // Create an OpenGL ES2.0 context
        setEGLContextClientVersion(2);

        // Need a MyRender object next
        renderer = new MyGLRenderer();

        //Set the Render for drawing on the GLSurfaceView
        setRenderer(renderer);
        // Render the view only when there is a change in the drawing data
        // setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }


   // public MyGLSurfaceView(OGLView oglView) {
   //     super();
   // }
}

package sharedcode.turboeditor.gesture;

import android.view.GestureDetector;
import android.util.Log;
import android.view.MotionEvent;

public class MyGestureListener extends GestureDetector.SimpleOnGestureListener{
    private static final String DEBUG_TAG = "Gestures";

    public boolean onDown(MotionEvent event) {
        Log.d(DEBUG_TAG,"onDown: " + event.toString());
        return true;
    }

    public boolean onFling(MotionEvent event1, MotionEvent event2,float velocityX, float velocityY) {
        Log.d(DEBUG_TAG, "onFling: " + event1.toString() + event2.toString());
        return true;
    }
}

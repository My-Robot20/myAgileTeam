package sharedcode.turboeditor.gesture;

import android.util.Log;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

/**
 * Created by Silas on 2/12/2018.
 */

public class ScaleListener
        extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    @Override
    public boolean onScale(ScaleGestureDetector detector) {
        float scaleFactor = detector.getScaleFactor();

        if (scaleFactor > 1) {
            Log.d("ScaleListener","Zoom out: ");
        } else {
            Log.d("ScaleListener","Zoom in: ");
        }
        return true;
    }

    @Override
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        return true;
    }

    @Override
    public void onScaleEnd(ScaleGestureDetector detector) {

    }
}


package com.guy.class22b_and_5;

import android.os.Handler;
import android.util.Log;

import com.google.android.material.textview.MaterialTextView;

public class StepDetector {

    private int counter = 0;
    private CallBack_StepDetector callBack_stepDetector = null;

    public StepDetector(CallBack_StepDetector callBack_stepDetector) {
        this.callBack_stepDetector = callBack_stepDetector;
    }

    public void setCallBack_stepDetector(CallBack_StepDetector callBack_stepDetector) {
        this.callBack_stepDetector = callBack_stepDetector;
    }

    public void start() {
        final Handler handler = new Handler();
        final int delay = 3000;

        handler.postDelayed(new Runnable() {
            public void run() {
                Log.d("pttt", "Step detect");
                counter++;

                if (callBack_stepDetector != null) {
                    callBack_stepDetector.stepDetect(counter);
                }



                if (counter > 5) {
                    if (callBack_stepDetector != null) {
                        callBack_stepDetector.jumpDetect();
                    }
                }

                handler.postDelayed(this, delay);
            }
        }, delay);
    }
}

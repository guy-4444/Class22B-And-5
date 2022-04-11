package com.guy.class22b_and_5.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.textview.MaterialTextView;
import com.guy.class22b_and_5.CallBack_StepDetector;
import com.guy.class22b_and_5.R;
import com.guy.class22b_and_5.StepDetector;

public class Activity_Steps extends AppCompatActivity {

    private MaterialTextView main_LBL_title;
    private StepDetector stepDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);

        main_LBL_title = findViewById(R.id.main_LBL_title);
        stepDetector = new StepDetector(callBack_stepDetector);

        stepDetector.start();


    }

    private CallBack_StepDetector callBack_stepDetector = new CallBack_StepDetector() {
        @Override
        public void stepDetect(int counter) {
            main_LBL_title.setText(counter + " Steps");
        }

        @Override
        public void jumpDetect() {
            main_LBL_title.setTextColor(Color.RED);
        }
    };
}
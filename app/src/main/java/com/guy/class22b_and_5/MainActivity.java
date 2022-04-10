package com.guy.class22b_and_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    private MaterialTextView main_LBL_title;
    private StepDetector stepDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LBL_title = findViewById(R.id.main_LBL_title);
        stepDetector = new StepDetector(callBack_stepDetector);


        stepDetector.start();


    }

    private CallBack_StepDetector callBack_stepDetector = new CallBack_StepDetector() {
        @Override
        public void stepDetect(int counter) {
            main_LBL_title.setText(counter + " Steps");
        }
    };
}
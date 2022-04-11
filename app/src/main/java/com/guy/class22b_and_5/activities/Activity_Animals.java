package com.guy.class22b_and_5.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.guy.class22b_and_5.CallBack_ActivityTitle;
import com.guy.class22b_and_5.CallBack_ListAnimalClicked;
import com.guy.class22b_and_5.R;
import com.guy.class22b_and_5.fragments.Fragment_Details;
import com.guy.class22b_and_5.fragments.Fragment_List;

public class Activity_Animals extends AppCompatActivity {

    private MaterialTextView animals_LBL_title;
    private MaterialButton animals_BTN_showAnimal;

    private Fragment_List fragment_list;
    private Fragment_Details fragment_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        findViews();


        fragment_list = new Fragment_List(this);
        fragment_list.setCallBack_listToActivity(callBack_activityTitle);
        fragment_list.setCallBack_listAnimalClicked(callBack_listAnimalClicked);
        getSupportFragmentManager().beginTransaction().add(R.id.animals_LAY_list, fragment_list).commit();


        fragment_details = new Fragment_Details();
        fragment_details.setCallBack_ActivityTitle(callBack_activityTitle);
        getSupportFragmentManager().beginTransaction().add(R.id.animals_LAY_details, fragment_details).commit();

        animals_BTN_showAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment_details.changeAnimalName("Elephant");
            }
        });
    }

    private CallBack_ListAnimalClicked callBack_listAnimalClicked = new CallBack_ListAnimalClicked() {
        @Override
        public void animalClicked(String animal) {
            fragment_details.changeAnimalName(animal);
        }
    };

    private CallBack_ActivityTitle callBack_activityTitle = new CallBack_ActivityTitle() {
        @Override
        public void setTitle(String str) {
            animals_LBL_title.setText(str);
        }
    };

    private void findViews() {
        animals_LBL_title = findViewById(R.id.animals_LBL_title);
        animals_BTN_showAnimal = findViewById(R.id.animals_BTN_showAnimal);
    }

}
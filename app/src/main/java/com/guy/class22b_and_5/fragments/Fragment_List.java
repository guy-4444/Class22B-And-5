package com.guy.class22b_and_5.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.guy.class22b_and_5.CallBack_ActivityTitle;
import com.guy.class22b_and_5.CallBack_ListAnimalClicked;
import com.guy.class22b_and_5.R;

public class Fragment_List extends Fragment {

    private AppCompatActivity activity;
    private MaterialButton list_BTN_lion;

    private CallBack_ActivityTitle callBack_ActivityTitle;
    private CallBack_ListAnimalClicked callBack_listAnimalClicked;

    public Fragment_List(AppCompatActivity activity) {
        this.activity = activity;
    }

    public void setCallBack_listToActivity(CallBack_ActivityTitle callBack_ActivityTitle) {
        this.callBack_ActivityTitle = callBack_ActivityTitle;
    }

    public void setCallBack_listAnimalClicked(CallBack_ListAnimalClicked callBack_listAnimalClicked) {
        this.callBack_listAnimalClicked = callBack_listAnimalClicked;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        findViews(view);
        initViews();

        return view;
    }

    private void initViews() {
        list_BTN_lion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lionClicked();
            }
        });
    }

    private void lionClicked() {
        Toast.makeText(activity, "Lion", Toast.LENGTH_SHORT).show();

        if (callBack_ActivityTitle != null) {
            callBack_ActivityTitle.setTitle("Lion 1");
        }

        if (callBack_listAnimalClicked != null) {
            callBack_listAnimalClicked.animalClicked("Lion 2");
        }
    }


    private void findViews(View view) {
        list_BTN_lion = view.findViewById(R.id.list_BTN_lion);
    }
}

package com.guy.class22b_and_5.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.guy.class22b_and_5.CallBack_ActivityTitle;
import com.guy.class22b_and_5.R;

public class Fragment_Details extends Fragment {

    private MaterialTextView details_LBL_name;

    private CallBack_ActivityTitle callBack_ActivityTitle;

    public void setCallBack_ActivityTitle(CallBack_ActivityTitle callBack_ActivityTitle) {
        this.callBack_ActivityTitle = callBack_ActivityTitle;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        findViews(view);

        return view;
    }

    public void changeAnimalName(String name) {
        details_LBL_name.setText(name);
    }

    private void findViews(View view) {
        details_LBL_name = view.findViewById(R.id.details_LBL_name);
    }
}

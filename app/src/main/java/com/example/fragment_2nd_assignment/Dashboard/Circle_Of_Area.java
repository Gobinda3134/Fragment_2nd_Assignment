package com.example.fragment_2nd_assignment.Dashboard;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragment_2nd_assignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Circle_Of_Area extends Fragment implements View.OnClickListener{
    private EditText etradius;
    private Button btnradius;
    private TextView tvdisplay;

    public Circle_Of_Area() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_circle__of__area, container, false);

        etradius=view.findViewById(R.id.etradius);
        btnradius=view.findViewById(R.id.btnradius);
        tvdisplay = view.findViewById(R.id.tvdisplaya);
        btnradius.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etradius.getText())) {
            etradius.setError("Enter Something to add ");
            ;
            return;
        }
        int radius = Integer.parseInt(etradius.getText().toString());
        int result = radius * radius * (22 / 7);

        tvdisplay.setText("area of circle is :" + result);
    }
}

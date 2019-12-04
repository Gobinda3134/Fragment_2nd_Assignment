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

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class Reverse_a_String extends Fragment implements View.OnClickListener{
    EditText name;
    TextView textview;
    Button save;

    public Reverse_a_String() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_a__string, container, false);
        name = view.findViewById(R.id.name);
        textview = view.findViewById(R.id.textview);
        save=view.findViewById(R.id.save);
        save.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if(id == R.id.save){
            if (!name.getText().toString().isEmpty()) {
                StringBuffer c = new StringBuffer(name.getText().toString());
                textview.setText(c.reverse());
            } else {
                name.setError("Enter NAME");
            }

        }

        }
    }


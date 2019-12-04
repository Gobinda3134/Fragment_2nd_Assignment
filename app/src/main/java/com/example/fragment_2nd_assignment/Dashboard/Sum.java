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
public class Sum extends Fragment implements View.OnClickListener{
    private EditText etfirst, etsecond;
    Button btnsum;
    TextView tvadd;
    public Sum() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);
        etfirst = view.findViewById(R.id.etfirst);
        etsecond = view.findViewById(R.id.etsecond);
        tvadd=view.findViewById(R.id.tvadd);
        btnsum = view.findViewById(R.id.btnsum);
        btnsum.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etfirst.getText())) {
            etfirst.setError("Enter Something");;
            return;
        }
        if (TextUtils.isEmpty(etsecond.getText())) {
            etsecond.setError("Enter Something");;
            return;
        }
        int first= Integer.parseInt(etfirst.getText().toString());
        int second= Integer.parseInt(etsecond.getText().toString());
        int result=first+second;
        tvadd.setText("Added Value is:"+result);
    }
}

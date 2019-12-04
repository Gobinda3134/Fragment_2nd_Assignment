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

import com.example.fragment_2nd_assignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Reverse_a_No extends Fragment implements  View.OnClickListener{
  private EditText etreverse;
  private Button btnreverse;
    private TextView tvreverse;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse_a__no, container, false);
        etreverse=view.findViewById(R.id.etreverse);
        tvreverse=view.findViewById(R.id.tvreverse);
        btnreverse=view.findViewById(R.id.btnreverse);
        btnreverse.setOnClickListener(this);
        return  view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etreverse.getText())) {
            etreverse.setError("Enter Something");;
            return;
        }

        int num =Integer.parseInt(etreverse.getText().toString());
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        tvreverse.setText("Reversed Value is :"+reversed);

    }
    }


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
public class Palindrome extends Fragment implements  View.OnClickListener {
    private EditText etnumber;
    private Button btnpalindrome;
    private TextView tvpalindrome;


    public Palindrome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        etnumber = view.findViewById(R.id.etpalindrome);
        btnpalindrome = view.findViewById(R.id.btnpalin);
        tvpalindrome = view.findViewById(R.id.tvpal);
        btnpalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id == R.id.btnpalin){

            if (TextUtils.isEmpty(etnumber.getText())) {
                etnumber.setError("Enter Something");

                return;
            }

            int r, sum = 0, temp;
            int n = Integer.parseInt(etnumber.getText().toString());//It is the number variable to be checked for palindrome

            temp = n;
            while (n > 0) {
                r = n % 10;  //getting remainder
                sum = (sum * 10) + r;
                n = n / 10;
                if (temp == sum)
                    tvpalindrome.setText("It is palindrome Number");
                else
                    tvpalindrome.setText("It is Not a palindrome Number");
            }
        }

    }
}

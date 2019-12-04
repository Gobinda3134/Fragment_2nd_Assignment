package com.example.fragment_2nd_assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragment_2nd_assignment.Dashboard.Automatic_No;
import com.example.fragment_2nd_assignment.Dashboard.Circle_Of_Area;
import com.example.fragment_2nd_assignment.Dashboard.Palindrome;
import com.example.fragment_2nd_assignment.Dashboard.Reverse_a_No;
import com.example.fragment_2nd_assignment.Dashboard.Reverse_a_String;
import com.example.fragment_2nd_assignment.Dashboard.Sum;

public class MainActivity extends AppCompatActivity{
   Button btnsum, btncircle,btnreverse, btnpalindrome, btnautomorphic, btna;
    private String status="f1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsum=findViewById(R.id.btnsum);
        btncircle=findViewById(R.id.btncircle);
        btnpalindrome=findViewById(R.id.btnpalidrome);
        btnautomorphic=findViewById(R.id.btnautomatic);
        btnreverse=findViewById(R.id.btnreverseno);
        btna=findViewById(R.id.btna);


        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Sum sum=new Sum();
                fragmentTransaction.add(R.id.fragmentcontainer,sum);
                fragmentTransaction.commit();
            }
        });
        btncircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Circle_Of_Area circle=new Circle_Of_Area();
                fragmentTransaction.replace(R.id.fragmentcontainer,circle);
                fragmentTransaction.commit();

            }
        });
        btnreverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                Reverse_a_No r =new Reverse_a_No();
                fragmentTransaction.replace(R.id.fragmentcontainer,r);
                fragmentTransaction.commit();
            }
        });

       btnpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Palindrome pal = new Palindrome();
                fragmentTransaction.replace(R.id.fragmentcontainer, pal);
                fragmentTransaction.commit();
            }

        });

       btna.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               FragmentManager fragmentManager=getSupportFragmentManager();
               FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
               Reverse_a_String st=new Reverse_a_String();
               fragmentTransaction.replace(R.id.fragmentcontainer,st);
               fragmentTransaction.commit();
           }
       });
       btnautomorphic.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               FragmentManager fragmentManager=getSupportFragmentManager();
               FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
               Automatic_No auto=new Automatic_No();
               fragmentTransaction.replace(R.id.fragmentcontainer,auto);
               fragmentTransaction.commit();
           }
       });

    }


    }


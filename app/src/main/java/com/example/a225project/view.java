package com.example.a225project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class view extends AppCompatActivity {

    ImageView goBackBtn;
    ImageView viewPatients;
    ImageView viewDoctors;
    ImageView viewNurses;

    ImageView viewAdmins;
    ImageView wardBtn;

    ImageView caregiversButoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        goBackBtn = findViewById(R.id.imageView62);

        goBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), adminHome.class);
                startActivity(i2);
            }
        });
        viewPatients=findViewById(R.id.imageView77);
        viewPatients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1= new Intent(getApplicationContext(), Admin_viewAllPatients.class);
                startActivity(i1);
            }
        });
        viewDoctors=findViewById(R.id.imageView74);
        viewDoctors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3= new Intent(getApplicationContext(), admin_viewAllDoctors.class);
                startActivity(i3);
            }
        });


        viewNurses=findViewById(R.id.imageView73);
        viewNurses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(getApplicationContext(), Admin_viewAllNurses.class);
                startActivity(i4);
            }
        });

        wardBtn=findViewById(R.id.imageView70);
        wardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5= new Intent(getApplicationContext(), admin_ward_details.class);
                startActivity(i5);
            }
        });

        viewAdmins = findViewById(R.id.imageView76);

        viewAdmins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5= new Intent(getApplicationContext(), Admin_ViewAll_Admins.class);
                startActivity(i5);
            }
        });

        caregiversButoon = findViewById(R.id.imageView75);

        caregiversButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5= new Intent(getApplicationContext(), admin_viewAllCaregivers.class);
                startActivity(i5);
            }
        });






    }


}
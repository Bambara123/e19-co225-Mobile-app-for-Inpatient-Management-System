package com.example.a225project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity3 extends AppCompatActivity {

    TextView checkupType;
    TextView heartRate;

    TextView textView2;
    TextView DocName;
    TextView DocTitle;
    TextView dateTxt;
    TextView prescription;
    TextView Meal;
    TextView TimeDuration;
    ImageButton goBackButton;
    ImageButton toReport;
    ImageButton appointmentSeeAll;
    Calendar calendar;
    ImageView profilePic;
    int day, month, year;

    private  String text_Checkup_type="Medical Checkup- Routine";
    private String Doc_Name="Dr. Dhammike Kumara";
    private  String Doc_Title="Medical Specialist";
    private double bpmRate= 90.6;
    private  String tabletDetails="Aspirin: 2 tablets of 325 mg each\n" +
            "Amoxicillin: 1 capsule of 500 mg\n" +
            "Ibuprofen: 1 tablet of 200 mg\n" +
            "Levothyroxine: 1 tablet of 50 mcg\n" +
            "Metformin: 1 tablet of 500 mg";
    private String meal="After Dinner";
    private String timeDuration="9.00PM - 10.00PM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        heartRate=findViewById(R.id.heartRate);
        checkupType=findViewById(R.id.checkupType);
        goBackButton=findViewById(R.id.goBackbttn1);
        DocName=findViewById(R.id.docName);
        DocTitle=findViewById(R.id.docTitle);
        textView2=findViewById(R.id.textView2);
        prescription=findViewById(R.id.prescription);
        toReport=findViewById(R.id.toReport);
        checkupType.setText(text_Checkup_type);
        Meal=findViewById(R.id.mealID);
        TimeDuration=findViewById(R.id.timeID);
        heartRate.setText(bpmRate+" BPM");
        DocName.setText(Doc_Name);
        DocTitle.setText(Doc_Title);
        prescription.setText(tabletDetails);
        appointmentSeeAll=findViewById(R.id.apptSeeAll);
        Meal.setText(meal);
        TimeDuration.setText(timeDuration);
        dateTxt=findViewById(R.id.dateTxt);
        // create a calender instance
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        ImageButton toPrescription;
        toPrescription=findViewById(R.id.patientPrescriptionSeeall);


        displayDate(year, month, day);

        profilePic=findViewById(R.id.imageView11);
        String username = getIntent().getStringExtra("username");
        //username = username.substring(2);
        textView2.setText(username.substring(2));
        toPrescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5= new Intent(getApplicationContext(),Patient_prescriptionView.class);
                String flag="P";
                i5.putExtra("Flag",flag);

                startActivity(i5);
            }
        });

        profilePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(getApplicationContext(),EditProfile.class);

                i4.putExtra("username",username);
                startActivity(i4);
            }
        });


        toReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3= new Intent(getApplicationContext(), Medical_Report.class);
                i3.putExtra("username",username);

                // to indicate it's from patient.
                String flag="P";
                i3.putExtra("Flag", flag);
                startActivity(i3);

            }
        });
        appointmentSeeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(getApplicationContext(), Medical_Appoinments.class);
                startActivity(i4);
            }
        });

        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i2);
            }
        });


    }

    private void displayDate(int year, int month, int day) {
        month=month+1;
        String date = day+"/"+month+"/"+year;
        dateTxt.setText(date);
    }
}

package com.example.blooddonor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hosdonlogin extends AppCompatActivity {
    Button mHosDonBtn,mDonorBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hosdonlogin);
        mHosDonBtn=(Button) findViewById(R.id.hosDonBtn);
        mDonorBtn=(Button) findViewById(R.id.donorBtn);
        mHosDonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hosdonlogin.this,hospitalregister.class);
                startActivity(intent);
            }
        });
        mHosDonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hosdonlogin.this,register.class);
                startActivity(intent);
            }






    });
    }

}

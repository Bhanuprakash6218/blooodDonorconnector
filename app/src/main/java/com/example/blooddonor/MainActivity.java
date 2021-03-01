package com.example.blooddonor;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import static com.google.common.collect.ComparisonChain.start;
import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread=new Thread(new Runnable(){
            @Override
            public void run(){
                try{
                    sleep(5000);
                    Intent intent= new Intent(MainActivity.this,hosdonlogin.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }


        });
        start();
    }


}
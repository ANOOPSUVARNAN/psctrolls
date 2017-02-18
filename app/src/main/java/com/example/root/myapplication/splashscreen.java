package com.example.root.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread mt = new Thread() {
                    @Override
                    public void run() {
                        try {
                            sleep(2000);
                            Intent  i=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i);
                            finish();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                mt.start();
            }

        }





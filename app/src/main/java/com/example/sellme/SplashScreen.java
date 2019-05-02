package com.example.sellme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences1=getSharedPreferences("myFile", Context.MODE_PRIVATE);

                String myName=sharedPreferences1.getString("name","Guest");






                if (myName !=("Guest")){

                    Intent intent1=new Intent(SplashScreen.this,List_View.class);

                    intent1.putExtra("name",myName);

                    startActivity(intent1);
                    finish();



                }else {

                    Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                    finish();





                }


            }
        },1000);
    }
}

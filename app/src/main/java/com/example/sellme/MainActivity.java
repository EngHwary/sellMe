package com.example.sellme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    List_View listView;
    ArrayList<Items> items;
    ArrayAdapter adapter;
    Button loginButton;
    CheckBox checkBox,checkBox2;
    EditText edit1,edit2;
    TextView tex11,tex123;
    public String myName;
    boolean check =false;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton=findViewById(R.id.login);
        checkBox=findViewById(R.id.checkBox1);
        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        tex11=findViewById(R.id.tex11);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {




                SharedPreferences sharedPreferences=getSharedPreferences("myFile" , Context.MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString("name",edit1.getText().toString());
                editor.putString("password",edit2.getText().toString());
                editor.apply();








            }
        });



        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,List_View.class);


               String myName= edit1.getText().toString();

                intent.putExtra("name",myName);
                startActivity(intent);



            }
        });












    }
}

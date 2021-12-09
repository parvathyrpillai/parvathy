package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    AppCompatButton b1,b2;
    String getname,getaddress,getphonenumber,getemailid,getusername,getpassword,getconfirmpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.address);
        ed3=(EditText)findViewById(R.id.phonenumber);
        ed4=(EditText)findViewById(R.id.emailid);
        ed5=(EditText)findViewById(R.id.username);
        ed6=(EditText)findViewById(R.id.password);
        ed7=(EditText)findViewById(R.id.confirmpasswrd);
        b1=(AppCompatButton)findViewById(R.id.gotoreg);
        b2 = (AppCompatButton) findViewById(R.id.Backtologin);

            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    getname = ed1.getText().toString();
                    Toast.makeText(getApplicationContext(), "name", Toast.LENGTH_SHORT).show();
                    getaddress = ed2.getText().toString();
                    Toast.makeText(getApplicationContext(), "address", Toast.LENGTH_SHORT).show();
                    getphonenumber = ed3.getText().toString();
                    Toast.makeText(getApplicationContext(), "phonenumber", Toast.LENGTH_SHORT).show();
                    getemailid = ed4.getText().toString();
                    Toast.makeText(getApplicationContext(), "emailid", Toast.LENGTH_SHORT).show();
                    getusername = ed5.getText().toString();
                    Toast.makeText(getApplicationContext(), "username", Toast.LENGTH_SHORT).show();
                    getpassword = ed6.getText().toString();
                    Toast.makeText(getApplicationContext(), "password", Toast.LENGTH_SHORT).show();
                    getconfirmpassword = ed7.getText().toString();
                    Toast.makeText(getApplicationContext(), "confirmpassword", Toast.LENGTH_SHORT).show();

                }

            });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });
    }
}
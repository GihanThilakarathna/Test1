package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username1;
    EditText password1;
    Button BSave, BUpdate, BDelete, BView;
    Student std;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username1 =findViewById(R.id.Uname);
        password1=findViewById(R.id.Password);


        BSave = findViewById(R.id.Save);
        BUpdate = findViewById(R.id.Update);
        BDelete = findViewById(R.id.Delete);
        BView = findViewById(R.id.View);

        std = new Student();
        BSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (TextUtils.isEmpty(username1.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "PLz username", Toast.LENGTH_SHORT).show();
                    } else if (TextUtils.isEmpty(password1.getText().toString())) {
                        Toast.makeText(getApplicationContext(), "ple pass", Toast.LENGTH_SHORT).show();
                    } else {
                        std.setUsername(username1.getText().toString().trim());
                        std.setPassword(password1.getText().toString().trim());

                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

        private void clearControl() {
            username1.setText("");
            password1.setText("");

        }
    }


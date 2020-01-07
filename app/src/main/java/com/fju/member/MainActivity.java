package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    boolean logon = false;
    private EditText edName;
    private EditText edAge;
    private EditText edGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edName = findViewById(R.id.ed_name);
        edAge = findViewById(R.id.ed_age);
        edGender = findViewById(R.id.ed_gender);
        String namee = getSharedPreferences("name", MODE_PRIVATE)
                .getString("NAME", "");
        edName.setText(namee);
        String name = edName.getText().toString();
        String agee = getSharedPreferences("age", MODE_PRIVATE)
                .getString("AGE", "");
        edAge.setText(agee);
        String age = edAge.getText().toString();
        String genderr = getSharedPreferences("gender", MODE_PRIVATE)
                .getString("GENDER", "");
        edGender.setText(genderr);
        String gender = edGender.getText().toString();
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(age) || TextUtils.isEmpty(gender)) {
            Intent intent = new Intent(MainActivity.this, NicknameActivity.class);
            startActivity(intent);
        }
    }

    }
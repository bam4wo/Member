package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }

    public void enter(View view) {
        EditText gender = findViewById(R.id.gender);
        String gen = gender.getText().toString();
        Intent intent = new Intent(GenderActivity.this, MainActivity.class);
        SharedPreferences sharedPreferences = getSharedPreferences("gender", MODE_PRIVATE);
        sharedPreferences.edit()
                .putString("GENDER", gen)
                .commit();
        startActivity(intent);
    }
}

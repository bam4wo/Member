package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {

    private EditText age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

    }

    public void enter(View view){
        age = findViewById(R.id.age);
        String agee = age.getText().toString();
        Intent intent = new Intent(AgeActivity.this,GenderActivity.class);
        SharedPreferences sharedPreferences = getSharedPreferences("age",MODE_PRIVATE);
        sharedPreferences.edit()
                .putString("AGE",agee)
                .commit();
        startActivity(intent);
    }
}

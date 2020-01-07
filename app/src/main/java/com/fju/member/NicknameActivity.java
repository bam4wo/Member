package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ShareActionProvider;

public class NicknameActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
    }

    @Override
    public void onClick(View v) {
        nickname = findViewById(R.id.nickname);
        String namee = nickname.getText().toString();
        Intent intent = new Intent(NicknameActivity.this,AgeActivity.class);
        SharedPreferences sharedPreferences = getSharedPreferences("name",MODE_PRIVATE);
        sharedPreferences.edit()
                .putString("NAME",namee)
                .commit();
        startActivity(intent);
        }


}

package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NicknameActivity extends AppCompatActivity {

    private EditText nickname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
    }

    public void nameenter(View view){
        nickname = findViewById(R.id.nickname);
        String namee = nickname.getText().toString();
        Intent intent = new Intent(NicknameActivity.this,AgeActivity.class);
    }
}

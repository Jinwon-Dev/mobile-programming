package com.example.toy_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 인텐트를 이용하여 음식 선택 액티비티로 연결되게 한다.
     */
    public void onClick(View view) {
        Intent intent = new Intent(this, MenuChoiceActivity.class);
        startActivity(intent);
    }
}
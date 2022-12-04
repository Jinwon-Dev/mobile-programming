package com.example.toy_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MenuChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    public void menuChoice(View view) {

        /**
         * 각각의 라디오 버튼 생성
         */
        RadioButton meet = (RadioButton) findViewById(R.id.meet);
        RadioButton noodle = (RadioButton) findViewById(R.id.noodle);
        RadioButton rice = (RadioButton) findViewById(R.id.rice);
        RadioButton seafood = (RadioButton) findViewById(R.id.seafood);
        RadioButton snack = (RadioButton) findViewById(R.id.snack);

        /**
         * 선택한 음식 종류에 따라서, 인텐트를 이용하여 다음 액티비티로 가게 설정한다.
         */
        if (meet.isChecked()) {
            Intent intent = new Intent(this, MeetFoodActivity.class);
            startActivity(intent);
        } else if (noodle.isChecked()) {
            Intent intent = new Intent(this, NoodleFoodActivity.class);
            startActivity(intent);
        } else if (rice.isChecked()) {
            Intent intent = new Intent(this, RiceFoodActivity.class);
            startActivity(intent);
        } else if (seafood.isChecked()) {
            Intent intent = new Intent(this, SeafoodFoodActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, SnackFoodActivity.class);
            startActivity(intent);
        }
    }

    /**
     * 옵션 메뉴를 생성
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    /**
     * 옵션 메뉴를 적용하여 메뉴를 클릭하면 홈 화면으로 돌아가도록 설정
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.back:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                return true;
            default:
        }

        return super.onOptionsItemSelected(item);
    }
}
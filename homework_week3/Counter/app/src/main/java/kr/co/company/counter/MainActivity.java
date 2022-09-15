package kr.co.company.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = (Button) findViewById(R.id.Button1);
        Button minus = (Button) findViewById(R.id.Button2);
        Button reset = (Button) findViewById(R.id.Button3);
        TextView number = (TextView) findViewById(R.id.TextView);

        plus.setOnClickListener(e -> {
            String s1 = number.getText().toString();
            int result = Integer.parseInt(s1);
            result++;
            number.setText("" + result);
        });

        minus.setOnClickListener(e -> {
            String s1 = number.getText().toString();
            int result = Integer.parseInt(s1);
            result--;
            number.setText("" + result);
        });

        reset.setOnClickListener(e -> {
            String s1 = number.getText().toString();
            int result = Integer.parseInt(s1);
            result = 0;
            number.setText("" + result);
        });

    }
}
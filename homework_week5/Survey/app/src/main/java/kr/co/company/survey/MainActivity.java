package kr.co.company.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        RadioButton first = (RadioButton) findViewById(R.id.first);
        RadioButton second = (RadioButton) findViewById(R.id.second);
        RadioButton third = (RadioButton) findViewById(R.id.third);
        ImageView imageView = (ImageView) findViewById(R.id.imageview);

        if (first.isChecked()) {
            imageView.setImageResource(R.drawable.kitkat);
        } else if (second.isChecked()) {
            imageView.setImageResource(R.drawable.jellybean);
        } else {
            imageView.setImageResource(R.drawable.gingerbread);
        }
    }
}
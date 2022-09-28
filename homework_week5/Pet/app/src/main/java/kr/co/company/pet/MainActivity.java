package kr.co.company.pet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton first = (RadioButton) findViewById(R.id.first);
        RadioButton second = (RadioButton) findViewById(R.id.second);
        RadioButton third = (RadioButton) findViewById(R.id.third);
        ImageView imageView = (ImageView) findViewById(R.id.imageview);
        Button button = (Button) findViewById(R.id.choose);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (first.isChecked()) {
                    imageView.setImageResource(R.drawable.bird1);
                } else if (second.isChecked()) {
                    imageView.setImageResource(R.drawable.cat1);
                } else {
                    imageView.setImageResource(R.drawable.dog1);
                }
            }
        });
    }

}
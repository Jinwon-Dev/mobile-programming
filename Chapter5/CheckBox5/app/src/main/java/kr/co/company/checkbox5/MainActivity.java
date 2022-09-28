package kr.co.company.checkbox5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.imageView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.checkBox:
                if (checked) imageView1.setImageResource(R.drawable.sandwich1);
                else imageView1.setImageResource(0);
                break;
            case R.id.checkBox2:
                if (checked) imageView2.setImageResource(R.drawable.sandwich2);
                else imageView2.setImageResource(0);
                break;
        }
    }
}
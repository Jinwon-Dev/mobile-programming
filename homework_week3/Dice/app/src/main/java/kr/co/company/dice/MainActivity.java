package kr.co.company.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.ImageView);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        Button button = (Button) findViewById(R.id.Button);

        TextView count1 = (TextView) findViewById(R.id.count1);
        TextView count2 = (TextView) findViewById(R.id.count2);
        TextView count3 = (TextView) findViewById(R.id.count3);
        TextView count4 = (TextView) findViewById(R.id.count4);
        TextView count5 = (TextView) findViewById(R.id.count5);
        TextView count6 = (TextView) findViewById(R.id.count6);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Random random = new Random();
                int number = 0;
                number = random.nextInt(6) + 1;

                Random random2 = new Random();
                int number2 = 0;
                number2 = random.nextInt(6) + 1;

                if (number == 1) {
                    imageView.setImageResource(R.drawable.dice1);
                    String cDice1 = count1.getText().toString();
                    int rDice1 = Integer.parseInt(cDice1);
                    rDice1++;
                    count1.setText("" + rDice1);
                } else if (number == 2) {
                    imageView.setImageResource(R.drawable.dice2);
                    String cDice2 = count2.getText().toString();
                    int rDice2 = Integer.parseInt(cDice2);
                    rDice2++;
                    count2.setText("" + rDice2);
                } else if (number == 3) {
                    imageView.setImageResource(R.drawable.dice3);
                    String cDice3 = count3.getText().toString();
                    int rDice3 = Integer.parseInt(cDice3);
                    rDice3++;
                    count3.setText("" + rDice3);
                } else if (number == 4) {
                    imageView.setImageResource(R.drawable.dice4);
                    String cDice4 = count4.getText().toString();
                    int rDice4 = Integer.parseInt(cDice4);
                    rDice4++;
                    count4.setText("" + rDice4);
                } else if (number == 5) {
                    imageView.setImageResource(R.drawable.dice5);
                    String cDice5 = count5.getText().toString();
                    int rDice5 = Integer.parseInt(cDice5);
                    rDice5++;
                    count5.setText("" + rDice5);
                } else if (number == 6) {
                    imageView.setImageResource(R.drawable.dice6);
                    String cDice6 = count6.getText().toString();
                    int rDice6 = Integer.parseInt(cDice6);
                    rDice6++;
                    count6.setText("" + rDice6);
                }

                if (number2 == 1) {
                    imageView2.setImageResource(R.drawable.dice1);
                    String cDice1 = count1.getText().toString();
                    int rDice1 = Integer.parseInt(cDice1);
                    rDice1++;
                    count1.setText("" + rDice1);
                } else if (number2 == 2) {
                    imageView2.setImageResource(R.drawable.dice2);
                    String cDice2 = count2.getText().toString();
                    int rDice2 = Integer.parseInt(cDice2);
                    rDice2++;
                    count2.setText("" + rDice2);
                } else if (number2 == 3) {
                    imageView2.setImageResource(R.drawable.dice3);
                    String cDice3 = count3.getText().toString();
                    int rDice3 = Integer.parseInt(cDice3);
                    rDice3++;
                    count3.setText("" + rDice3);
                } else if (number2 == 4) {
                    imageView2.setImageResource(R.drawable.dice4);
                    String cDice4 = count4.getText().toString();
                    int rDice4 = Integer.parseInt(cDice4);
                    rDice4++;
                    count4.setText("" + rDice4);
                } else if (number2 == 5) {
                    imageView2.setImageResource(R.drawable.dice5);
                    String cDice5 = count5.getText().toString();
                    int rDice5 = Integer.parseInt(cDice5);
                    rDice5++;
                    count5.setText("" + rDice5);
                } else if (number2 == 6) {
                    imageView2.setImageResource(R.drawable.dice6);
                    String cDice6 = count6.getText().toString();
                    int rDice6 = Integer.parseInt(cDice6);
                    rDice6++;
                    count6.setText("" + rDice6);
                }
            }
        });
    }
}
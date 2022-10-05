package com.example.graphicbitmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.*;
import android.os.Bundle;
import android.view.View;

class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        Matrix m = new Matrix();
        m.preScale(1, -1);

        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.house);
        Bitmap mb = Bitmap.createBitmap(b, 0, 0, b.getWidth(), b.getHeight(), m, false);
        Bitmap sb = Bitmap.createScaledBitmap(b, 600, 600, false);
        canvas.drawBitmap(mb, 0, 0, null);
        canvas.drawBitmap(sb, 100, 100, null);
    }
}

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView w = new MyView(this);
        setContentView(w);
    }
}

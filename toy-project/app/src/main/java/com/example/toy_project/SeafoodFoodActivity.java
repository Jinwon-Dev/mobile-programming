package com.example.toy_project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class SeafoodFoodActivity extends AppCompatActivity {

    ListView list;
    String[] names = {"스시하린", "해물왕국", "무모한 초밥", "스시킴"}; // 가게 이름을 넣기 위한 문자열 배열

    Integer[] images = {R.drawable.seafood}; // 이미지 넣기

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seafood);

        /**
         * 리스트 뷰를 이용하여 가게 상호들을 리스트로 볼 수 있게 만들었다.
         */
        CustomList adapter = new CustomList(SeafoodFoodActivity.this);
        list = (ListView) findViewById(R.id.seafoodlist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), names[+position], Toast.LENGTH_SHORT).show();

                /**
                 * 가게 별로 클릭 했을 때, URI를 통한 웹 사이트로의 연결
                 */
                if (position == 0) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/1834555682?c=14171327.8995604,4350033.5358917,13,0,0,0,dh&placePath=%2Fhome&entry=plt"));
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/945098891?c=14170202.4388038,4348372.6278703,13,0,0,0,dh&placePath=%2Fhome"));
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/1550546637?c=14170740.5239988,4348654.3544116,13,0,0,0,dh&placePath=%2Fhome&entry=plt"));
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/37558771?c=14170799.7851891,4348796.1510057,13,0,0,0,dh&placePath=%2Fhome"));
                    startActivity(intent);
                }
            }
        });
    }

    /**
     * 리스트 뷰를 이용하여 가게 상호들을 리스트로 볼 수 있게 만들었다.
     */
    public class CustomList extends ArrayAdapter<String> {
        private final Activity context;

        public CustomList(Activity context) {
            super(context, R.layout.seafood_list, names);
            this.context = context;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.seafood_list, null, true);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
            TextView name = (TextView) rowView.findViewById(R.id.name);

            name.setText(names[position]);
            imageView.setImageResource(images[0]);

            return rowView;
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

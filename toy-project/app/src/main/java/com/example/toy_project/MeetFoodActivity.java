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

public class MeetFoodActivity extends AppCompatActivity {

    ListView list;
    String[] names = {"서래갈매기", "한우천국", "원조한밭뒷고기", "삼겹맨숀"}; // 가게 이름을 넣기 위한 문자열 배열

    Integer[] images = {R.drawable.meet}; // 이미지 넣기

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeet);

        /**
         * 리스트 뷰를 이용하여 가게 상호들을 리스트로 볼 수 있게 만들었다.
         */
        CustomList adapter = new CustomList(MeetFoodActivity.this);
        list = (ListView) findViewById(R.id.meetlist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), names[+position], Toast.LENGTH_SHORT).show(); // 토스트 메시지 출력

                /**
                 * 가게 별로 클릭 했을 때, URI를 통한 웹 사이트로의 연결
                 */
                if (position == 0) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%ED%95%9C%EB%B0%AD%EB%8C%80%ED%95%99%EA%B5%90%20%EA%B3%A0%EA%B9%83%EC%A7%91/place/36364285?placePath=%3Fentry%253Dpll&c=14170124.0527018,4348571.0171582,15,0,0,0,dh"));
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/1357621418?c=14170747.9822878,4348939.7813975,13,0,0,0,dh&placePath=%2Fhome&entry=plt"));
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/1558918068?c=14170930.576462891,4348683.723294469,13,0,0,0,dh&placePath=%2Fhome&entry=plt"));
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/entry/place/1295255646?c=14170983.245016497,4348647.416199021,13,0,0,0,dh&placePath=%2Fhome&entry=plt"));
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
            super(context, R.layout.meet_list, names);
            this.context = context;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.meet_list, null, true);
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

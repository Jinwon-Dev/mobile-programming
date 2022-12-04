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

public class SnackFoodActivity extends AppCompatActivity {

    ListView list;
    String[] names = {"신가네 매운 떡볶이", "바로그집", "이삭 토스트", "고래분식"}; // 가게 이름을 넣기 위한 문자열 배열

    Integer[] images = {R.drawable.snack}; // 이미지 넣기

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        /**
         * 리스트 뷰를 이용하여 가게 상호들을 리스트로 볼 수 있게 만들었다.
         */
        CustomList adapter = new CustomList(SnackFoodActivity.this);
        list = (ListView) findViewById(R.id.snacklist);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), names[+position], Toast.LENGTH_SHORT).show();

                /**
                 * 가게 별로 클릭 했을 때, URI를 통한 웹 사이트로의 연결
                 */
                if (position == 0) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%8B%A0%EA%B0%80%EB%84%A4%20%EB%A7%A4%EC%9A%B4%EB%96%A1%EB%B3%B6%EC%9D%B4/place/38641998?placePath=%3Fentry=pll%26from=nx%26fromNxList=true&c=14170107.2921662,4348557.7516970,15,0,0,0,dh"));
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EB%B0%94%EB%A1%9C%20%EA%B7%B8%EC%A7%91/place/35736494?placePath=%3Fentry=pll%26from=nx%26fromNxList=true&c=14169942.9354875,4348657.0932086,15,0,0,0,dh"));
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EC%9D%B4%EC%82%AD%20%ED%86%A0%EC%8A%A4%ED%8A%B8/place/1485404902?placePath=%3Fentry=pll%26from=nx%26fromNxList=true&c=14169898.2004742,4348847.5066472,15,0,0,0,dh"));
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://map.naver.com/v5/search/%EA%B3%A0%EB%9E%98%EB%B6%84%EC%8B%9D/place/1824213410?placePath=%3Fentry=pll%26from=nx%26fromNxList=true&c=14169902.9760803,4348693.2610053,15,0,0,0,dh"));
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
            super(context, R.layout.snack_list, names);
            this.context = context;
        }

        @Override
        public View getView(int position, View view, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.snack_list, null, true);
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

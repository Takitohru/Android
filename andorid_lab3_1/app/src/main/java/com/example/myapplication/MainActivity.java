package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends Activity{
    private List<Map<String,Object>> lists;
    private SimpleAdapter adapter;
    private ListView listView;
    //    定义数据
    private String[] theme = {"Lion","Tiger","Money","Dog","Cat","Elephant"};
    private int[] imageViews = {R.drawable.lion,R.drawable.tiger,R.drawable.monkey,R.drawable.dog,R.drawable.cat,R.drawable.elephant};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.ll1);
//        准备数据源
        lists = new ArrayList<>();
        for(int i = 0;i < theme.length;i++){
            Map<String,Object> map =new HashMap<>();
            map.put("image",imageViews[i]);
            map.put("theme",theme[i]);
            lists.add(map);
        }
        adapter = new SimpleAdapter(MainActivity.this,lists,R.layout.sampleadpater
                ,new String[]{"image","theme"}
                ,new int[]{R.id.image1,R.id.text1});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(MainActivity.this,theme[position],Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}

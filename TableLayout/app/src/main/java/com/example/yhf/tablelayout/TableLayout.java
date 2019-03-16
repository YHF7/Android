package com.example.yhf.tablelayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

public class TableLayout extends AppCompatActivity {

    // 1. 声明控件对象
    TextView text1;
    EditText edit1;
    AutoCompleteTextView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo03);

        //2. 通过id建立关系
        text1=(TextView)findViewById(R.id.text1);
        edit1=(EditText)findViewById(R.id.edit1);
        act=(AutoCompleteTextView)findViewById(R.id.act);

        String[] data = new String[]{"China","Chiness","Check"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        act.setAdapter(adapter);

//        edit1.setText("我是输入的数据");
        System.out.println(edit1.getText());
        Log.i("abc", "onCreate: dddd");
        text1.setText("你个菜逼");
        text1.setTextColor(Color.CYAN);
        text1.setTextSize(30);


    }
}

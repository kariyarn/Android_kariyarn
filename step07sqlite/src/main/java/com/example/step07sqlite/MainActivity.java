package com.example.step07sqlite;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.step07sqlite.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    DBHelper dbHelper;
    List<Todo> todo;
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //activity_main.xml에 정의된 객체의 참조값
        inputText=(EditText) findViewById(R.id.inputText);
        Button addBtn=(Button) findViewById(R.id.addBtn);
        todo = new ArrayList<>();

        //버튼에 리스너 등록
        addBtn.setOnClickListener(view -> {
            //입력한 문자열
            String msg=inputText.getText().toString();
            Map<String, String> map = new HashMap<>();
            map.put("msg", msg);
        });

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        /*
            DBHelper객체를 생성해서 참조값을 필드에 저장하기
            name은 DB의 이름을 마음대로 정해서 전달하면 된다.
         */
        dbHelper = new DBHelper(this,"MyDB.sqlite", null, 1);

        TodoAdapter adapter = new TodoAdapter(this, R.layout.listview_cell, todo);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
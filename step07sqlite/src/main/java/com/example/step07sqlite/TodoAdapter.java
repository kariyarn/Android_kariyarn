package com.example.step07sqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TodoAdapter extends BaseAdapter {
    //필요한 필드 선언
     Context context;
     int layoutRes;
     List<Todo> list;
     //생성자
    public TodoAdapter(Context context, int layoutRes, List<Todo> list) {
        this.context = context;
        this.layoutRes = layoutRes;
        this.list = list;
    }
    //모델의 갯수
    @Override
    public int getCount() {
        return list.size();
    }
    //i번째 인덱스에 해당하는 모델
    @Override
    public Object getItem(int i) {
        return list.get(i);
    }
    //i번째 인덱스에 해당하는 모델의 아이디(pk)
    @Override
    public long getItemId(int i) {
        return list.get(i).getNum();
    }
    //i번째 cell의 view를 만들어서 리턴
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null){
            //res/Layout/listview_cell.xml문서를 전개해서 view객체를 만든다.
            view = LayoutInflater.from(context).inflate(R.layout.listview_cell, viewGroup, false);
        }
        //i번째 todo 객체를 얻어와서 textView 에 출력하고
        Todo tmp = list.get(i);
        TextView content=view.findViewById(R.id.text_content);
        TextView regdate=view.findViewById(R.id.text_regdate);
        content.setText(tmp.getContent());
        content.setText(tmp.getRegdate());
        //해당 view를 리턴해준다.
        return view;
    }
}

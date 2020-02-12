package com.gura.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // MainActivity 가 활성화 될때 최초 한번 호출되는 메소드
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //res/Layout/activity_main.xml 문서를 전개해서 화면 구성하기
        setContentView(R.layout.activity_main);
    }

    //버튼을 눌렀을때 메소드가 호출되게 하려면 인자로 view 객체를 받을 준비를 하면된다.
    public void btnClicked(View v) {
        //로그 출력하기
        Log.d("one","버튼을 눌렀네요?");
        Toast.makeText(this,"버튼 눌렀음?",Toast.LENGTH_LONG).show();
        //알림창 띄우기
        new AlertDialog.Builder(this)
                .setTitle("알림")
                .setMessage("버튼을 눌렀네?")
                .setNegativeButton("확인",null)
                .create()
                .show();


    }
}

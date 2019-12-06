package com.example.obesitycheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText hei1,wei1;
    Button btn1;
    TextView answer1;
    String strhei1,strwei1;
//    ImageView ivb;
    double result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("비만도 체크어플");
        hei1=(EditText)findViewById(R.id.hei1);
        wei1=(EditText)findViewById(R.id.wei1);
        btn1=(Button)findViewById(R.id.btn1);
        answer1=(TextView)findViewById(R.id.answer1);
//        ivb=(ImageView)findViewById(R.id.ivb);

//        ivb=(ImageView)findViewById(R.id.ivb);  이미지 뜨는 부분을 생성

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                strhei1=hei1.getText().toString();
                strwei1=wei1.getText().toString();

                if(strhei1.trim().equals("")||strwei1.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"해당란을 입력하세요.",Toast.LENGTH_SHORT).show();
                }else if(strhei1.trim().equals("")||strwei1.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "해당란을 입력하세요.", Toast.LENGTH_SHORT).show();
                }else if(strwei1.trim().equals("0")){
                    Toast.makeText(getApplicationContext(),"해당 값엔 0이 될 수 없습니다.",Toast.LENGTH_SHORT).show();
                } else if(strhei1.trim().equals("0")) {
                    Toast.makeText(getApplicationContext(), "해당 값엔 0이 될 수 없습니다.", Toast.LENGTH_SHORT).show();
                } else {

//                        ivb.setImageResource(R.drawable.ob);해당 구문은 이미지를 삽입하여 출력하는 구문
                    }
                result =(( Double.parseDouble(strhei1) - 100) * 0.9);
                if (Double.parseDouble(strwei1) < result+5 && Double.parseDouble(strwei1) > result-5) {
                    answer1.setText("정상입니다. 꾸준히 유지해 주십시오.");
//                    ivb.setImageResource(R.drawable.good);
                } if (Double.parseDouble(strwei1)< result-5) {
                    answer1.setText("마른채형입니다. 더 먹으세요.");
//                    ivb.setImageResource(R.drawable.thin);
                } if (Double.parseDouble(strwei1) > result+5) {
                    answer1.setText("비만입니다. 다이어트하세요.");
//                    ivb.setImageResource(R.drawable.ob);
                }
                    }
        });
    }
}

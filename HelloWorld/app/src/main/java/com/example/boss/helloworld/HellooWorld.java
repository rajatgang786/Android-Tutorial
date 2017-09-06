package com.example.boss.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HellooWorld extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helloo_world);
    }

   public void OnClickEvent(View v){
       EditText et = (EditText)findViewById(R.id.editText);
       EditText et1 = (EditText)findViewById(R.id.editText2);
       TextView tv = (TextView)findViewById(R.id.textView);
       int num1 = Integer.parseInt(et.getText().toString());
       int num2 = Integer.parseInt(et1.getText().toString());
       int sum = num1+num2;
       tv.setText(Integer.toString(sum));
   }
}

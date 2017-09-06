package com.example.boss.advancecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private TextView screen;
        private float numberbefore;
        private String operation;
        private ButtonClickListener btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen =(TextView)findViewById(R.id.Answer);
        btn = new ButtonClickListener();

        int idslist[] = {R.id.btnclear,R.id.btnsub,R.id.btnadd,R.id.btndivide,R.id.btnmul,R.id.btnequal,
            R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,
            R.id.btn0,R.id.btndot};

        for (int id : idslist)
        {
            View v = findViewById(id);
            v.setOnClickListener(btn);
        }
    }

    public void math(String str){
        numberbefore = Float.parseFloat(screen.getText().toString());
        operation = str;
        screen.setText("0");
    }

    public  void keyboard(String str){
        String current = screen.getText().toString();

        if(current.equals("0"))
            current="";
        current+=str;
        screen.setText(current);
    }

    private void result(){
        float numberafter = Float.parseFloat(screen.getText().toString());
        float result = 0;

        if(operation.equals("+"))
            result = numberbefore + numberafter;
        if(operation.equals("-"))
            result = numberbefore - numberafter;
        if(operation.equals("*"))
            result = numberbefore * numberafter;
        if(operation.equals("/"))
            result = numberbefore / numberafter;

        screen.setText(String.valueOf(result));
    }

    private class ButtonClickListener implements View.OnClickListener{

        public void onClick(View v){
            switch (v.getId()){
                    case R.id.btnclear:
                    screen.setText("0");
                    operation="";

                case R.id.btnadd:
                    math("+");
                    break;
                case R.id.btnsub:
                    math("-");
                    break;
                case R.id.btndivide:
                    math("/");
                    break;
                case R.id.btnmul:
                    math("*");
                    break;
                case R.id.btnequal:
                    result();
                    break;
                default:
                        String number = ((Button)v).getText().toString();
                        keyboard(number);
                    break;
            }
        }
    }
}

package com.example.boss.advancecalculatorpart2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText textanswer;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btndot, btnequal, btnsin, btncos, btntan, btnpow, btndeg;
    Button btnsqrt, btnred, btnclear, btnce, btnadd, btnsub, btnmul, btndiv, btnmod;
    Boolean solved = false , solvewitheq = false;
    Double answer ,val1 = 0.1,val2 = 0.0;
    String sign;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddOnclickListenersForButton();
    }

    private void AddOnclickListenersForButton() {

        textanswer = (EditText)findViewById(R.id.editText);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnequal = (Button)findViewById(R.id.btnequals);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btnadd = (Button) findViewById(R.id.btnadd);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnmod = (Button) findViewById(R.id.btnmod);
        btnsin = (Button) findViewById(R.id.btnsin);
        btncos = (Button) findViewById(R.id.btncos);
        btntan = (Button) findViewById(R.id.btntan);
        btndot = (Button) findViewById(R.id.btndot);
        btnred = (Button) findViewById(R.id.btnra);
        btnsqrt = (Button) findViewById(R.id.btnsq);
        btndeg = (Button) findViewById(R.id.btndeg);
        btnpow = (Button) findViewById(R.id.btnpo);
        btnce = (Button)findViewById(R.id.btnCE);
        btnclear = (Button)findViewById(R.id.btnClear);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true) {
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btn0.getText().toString());

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true){
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                  textanswer.setText(textanswer.getText().toString() + btn1.getText().toString());

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true){
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btn2.getText().toString());

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true){
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btn3.getText().toString());

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true) {
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btn4.getText().toString());

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true) {
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btn5.getText().toString());

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true) {
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btn6.getText().toString());

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true) {
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btn7.getText().toString());

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true) {
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btn8.getText().toString());

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true) {
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btn9.getText().toString());

            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solved == true || solvewitheq == true) {
                    textanswer.setText("");
                    solved = false;
                    solvewitheq = false;
                }
                    textanswer.setText(textanswer.getText().toString() + btndot.getText().toString());

            }
        });

        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(val2 == 0.0){
                        val1 = Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText("");
                        sign = "%";
                        val2 = Double.parseDouble("1");
                    }
                    else{
                        val1 = val1 % (Double.parseDouble(textanswer.getText().toString())/100);
                        textanswer.setText(val1.toString());
                        sign = "%";
                        solvewitheq = true;
                    }
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });

        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                        answer = Math.tan( Double.parseDouble(textanswer.getText().toString()));
                        val1 = 0.0;
                        val2 = 0.0;
                        textanswer.setText(answer.toString());
                        solvewitheq = true;
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });
        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    answer = Math.sin( Double.parseDouble(textanswer.getText().toString()));
                    val1 = 0.0;
                    val2 = 0.0;
                    textanswer.setText(answer.toString());
                    solvewitheq = true;
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });
        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    answer = Math.cos( Double.parseDouble(textanswer.getText().toString()));
                    val1 = 0.0;
                    val2 = 0.0;
                    textanswer.setText(answer.toString());
                    solvewitheq = true;
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });
        btnsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    answer = Math.sqrt( Double.parseDouble(textanswer.getText().toString()));
                    val1 = 0.0;
                    val2 = 0.0;
                    textanswer.setText(answer.toString());
                    solvewitheq = true;
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });
        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    answer = Math.toRadians( Double.parseDouble(textanswer.getText().toString()));
                    val1 = 0.0;
                    val2 = 0.0;
                    textanswer.setText(answer.toString());
                    solvewitheq = true;
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(val2 == 0.0){
                        val1 = Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText("");
                        sign = "+";
                        val2 = Double.parseDouble("1");
                    }
                    else{
                        val1 = val1 + Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText(val1.toString());
                        sign = "+";
                        solvewitheq = true;
                    }
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });


        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(val2 == 0.0){
                        val1 = Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText("");
                        sign = "-";
                        val2 = Double.parseDouble("1");
                    }
                    else{
                        val1 = val1 - Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText(val1.toString());
                        sign = "-";
                        solvewitheq = true;
                    }
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(val2 == 0.0){
                        val1 = Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText("");
                        sign = "*";
                        val2 = Double.parseDouble("1");
                    }
                    else{
                        val1 = val1 * Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText(val1.toString());
                        sign = "*";
                        solvewitheq = true;
                    }
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(val2 == 0.0){
                        val1 = Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText("");
                        sign = "/";
                        val2 = Double.parseDouble("1");
                    }
                    else{
                        val1 = val1 / Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText(val1.toString());
                        sign = "/";
                        solvewitheq = true;
                    }
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });

        btnpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(val2 == 0.0){
                        val1 = Double.parseDouble(textanswer.getText().toString());
                        textanswer.setText("");
                        sign = "^";
                        val2 = Double.parseDouble("1");
                    }
                    else{
                        val1 = Math.pow(val1 , (Double.parseDouble(textanswer.getText().toString())));
                        textanswer.setText(val1.toString());
                        sign = "^";
                        solvewitheq = true;
                    }
                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = 0.0;
                val2 = 0.0;
                textanswer.setText("");
            }
        });

        btnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int i = textanswer.getText().length();
                    textanswer.setText(textanswer.getText().subSequence(0,i-1));
                    if(textanswer.getText() == null)
                            val1 = 0.0;

                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    val2 = Double.parseDouble(textanswer.getText().toString());
                    switch (sign){

                        case "+": answer = val1+ val2;break;
                        case "-": answer = val1- val2;break;
                        case "*": answer = val1* val2;break;
                        case "/": answer = val1/ val2;break;
                        case "%": answer = val1% val2/100;break;
                        case "^": answer = Math.pow(val1,val2);break;
                        default:
                    }
                    textanswer.setText(String.format(answer.toString()));
                    val1 =0.0;val2=0.0;solved =true;sign="";

                }
                catch (Exception ex){
                    textanswer.setText("0");
                }
                finally {

                }
            }
        });
    }
}
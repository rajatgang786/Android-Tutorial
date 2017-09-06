package com.example.boss.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static EditText user,pass;
    private static Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginButton();
    }

    public void loginButton(){
        user = (EditText)findViewById(R.id.editText_Username);
        pass = (EditText)findViewById(R.id.editText_password);
        btn =(Button)findViewById(R.id.loginbutton);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(user.getText().toString().equals("Rajat") && pass.getText().toString().equals("rajat")){
                    Toast.makeText(Login.this,"user and pass is correct",Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent("com.example.boss.login.User");
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Login.this,"Wrong id and pass",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

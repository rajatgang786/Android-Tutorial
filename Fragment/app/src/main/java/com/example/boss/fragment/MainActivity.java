package com.example.boss.fragment;

import android.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeFragment(View view){
        Fragment fragment = new Fragment();

        if (view == (findViewById(R.id.fragment1)))
        {
            FragmentOne fragmentone = new FragmentOne();
            fragment = fragmentone;
            FragmentManager fm =  getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentplace,fragment);
            ft.commit();
        }
        if(view == (findViewById(R.id.fragment2)))
        {
            FragmentTwo fragmentTwo = new FragmentTwo();
            fragment = fragmentTwo;
            FragmentManager fm =  getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragmentplace,fragment);
            ft.commit();
        }
    }
}

package com.example.recyclerdirection.testmaterialdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bar(View v) {
        startActivity(new Intent(this,ToolBarActivity.class));
    }

    public void tabbar(View v) {
        startActivity(new Intent(this,TabBarActivity.class));
    }
}

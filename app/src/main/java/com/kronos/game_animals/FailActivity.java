package com.kronos.game_animals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucess);
        MyApplication.getInstance().addActivity(this);
    }

    public void exit(View view) {
        MyApplication.getInstance().finishAllActivity();
    }
}

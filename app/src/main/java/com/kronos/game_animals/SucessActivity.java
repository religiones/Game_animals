package com.kronos.game_animals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SucessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getInstance().addActivity(this);
        setContentView(R.layout.activity_failed);
    }

    public void exit(View view) {
        MyApplication.getInstance().finishAllActivity();
    }
}

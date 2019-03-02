package com.kronos.game_animals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.getInstance().addActivity(this);
    }

    public void exit(View view) {
        MyApplication.getInstance().finishAllActivity();
    }

    public void play(View view) {
        Intent intent = new Intent(MainActivity.this,PlayActivity.class);
        startActivity(intent);
    }
}

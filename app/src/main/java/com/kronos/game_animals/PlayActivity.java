package com.kronos.game_animals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PlayActivity extends AppCompatActivity {

    private int catId;
    private int eleId;
    private int fishId;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getInstance().addActivity(this);
        setContentView(R.layout.activity_play);
        Button btn_cat = (Button) findViewById(R.id.btn_cat);
        Button btn_ele = (Button) findViewById(R.id.btn_elephant);
        Button btn_fish = (Button) findViewById(R.id.btn_fish);
        Button btn_bird = (Button) findViewById(R.id.btn_bird);
        btn = (Button) findViewById(R.id.btn);
        catId = btn_cat.getId();
        fishId = btn_fish.getId();
        eleId = btn_ele.getId();
    }

    public void isRight(View view) {
        int id = view.getId();
        String answer = btn.getText().toString();
        if (getAnswer(id).equals(answer)){
            //answer wrong
            Intent intent = new Intent(PlayActivity.this,FailActivity.class);
            startActivity(intent);
        }
        else {
            //answer right
            Intent intent = new Intent(PlayActivity.this,SucessActivity.class);
            startActivity(intent);
        }
    }

    public String getAnswer(int id){
        if (id == catId){
            return "CAT";
        }
        else if (id == fishId){
            return "FISH";
        }
        else if (id == eleId){
            return "ELEPHANT";
        }
        else {
            return "BIRD";
        }
    }
}

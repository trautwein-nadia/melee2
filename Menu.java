package com.meleeChat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by nadia on 3/12/16.
 */
public class Menu extends AppCompatActivity{
    Bundle b;

    @Override
    protected void onResume() {
        getSupportActionBar().setTitle("Main Menu");
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    public void alertPlayersButton(View v) {
        Intent intent = new Intent(this, PlayerList.class);

        intent.putExtras(b); //pass lat and lon along

        startActivity(intent);
    }

    public void reportResultsButton(View v) {
        System.out.println("NOTHINGGG");
    }

    public void displayInfoButton(View v) {
        System.out.println("NOTHINGGG2");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        b = getIntent().getExtras(); //get lat an lon to pass to other activities

    }
}

package com.madla.madla_labact1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void link1(View view){
        Intent bIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ust.edu.ph"));
        startActivity(bIntent);
    }

    public void link2(View view){
        Intent bIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://myuste.ust.edu.ph/"));
        startActivity(bIntent2);
    }

    public void link3(View view){
        Intent bIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ust.blackboard.com/"));
        startActivity(bIntent3);
    }
}

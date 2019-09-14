package com.madla.madla_labact1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.btnPortals);
        button1.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
            openPortalsActivity();
            }
        });
        Button button2 = (Button) findViewById(R.id.btnGreetings);
        button2.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v) {
                Log.d("My Ust App", "Hello World");
            }
        });
    }


    public void openPortalsActivity() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }


}

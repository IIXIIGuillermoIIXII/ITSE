package com.example.king_.itse;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                /*cruze de ventana en 2 segundos*/
                Intent ventana = new Intent(MainActivity.this,login.class);
                startActivity(ventana);

                finish();
            }
        },2000);

    }
}

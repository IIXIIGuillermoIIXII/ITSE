package com.example.king_.itse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class mesas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mesas);


        ImageView mesas = (ImageView) findViewById(R.id.mesa_1);
        mesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ListPro =new  Intent(mesas.this,LeadsActivity.class);
                startActivity(ListPro);
            }
        });


    }
}

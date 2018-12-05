package com.example.king_.itse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button button1 =  (Button)findViewById(R.id.inicio);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {










                /*Iniciando a tu sistema*/
                Intent vamos = new Intent(login.this,mesas.class);
                startActivity(vamos);
                /*Mensaje para el usuario*/
                Toast Bienvenido = Toast.makeText(getApplicationContext(),"Bienvneido a tu sistema de ventas",Toast.LENGTH_LONG);
                Bienvenido.show();





            }
        });

    }
}

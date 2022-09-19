package com.example.preferences02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  EditText edt1,edt2,edt3,edt4;
  Button boto1;
  SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edtcodigo);
        edt2 = findViewById(R.id.edtnombre);
        edt3 = findViewById(R.id.edtprecio);
        edt4 = findViewById(R.id.edtcantidad);
        boto1 = findViewById(R.id.btnregistrar);
        preferences = getSharedPreferences("datos_producto", Context.MODE_PRIVATE);
    }
}
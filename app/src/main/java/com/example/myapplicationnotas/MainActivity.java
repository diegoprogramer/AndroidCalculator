package com.example.myapplicationnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSumar;
    EditText txtNumero1;
    EditText txtNumero2;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSumar = findViewById(R.id.btnSumar);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        txtResultado = findViewById(R.id.txtResultado);
    }
        public void sumar (View view){
            int num1 = Integer.parseInt(txtNumero1.getText().toString());
            int num2 = Integer.parseInt(txtNumero2.getText().toString());
            int res = num1 + num2;
            txtResultado.setText(""+res);
    }

    public void resetnum1(View view) {
        txtNumero1.setText("");
    }

    public void resetnum2(View view) {
        txtNumero2.setText("");
    }

}
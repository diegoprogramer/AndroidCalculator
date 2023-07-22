package com.example.myapplicationnotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.StringBuilder;
import java.math.BigDecimal;
import java.math.RoundingMode;


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

            try {
                double num1 = Double.parseDouble(txtNumero1 != null ? txtNumero1.getText().toString(): "0");
                double num2 = Double.parseDouble(txtNumero2 != null ? txtNumero2.getText().toString(): "0");
                double res = num2 != 0 && num1 != 0 ? num1 / (num2 * 0.01* num2 * 0.01 ) :-1;
                // validar si es un estado bueno o malo
                StringBuilder sb = new StringBuilder();

                if (res == -1) {
                    sb.append(" Datos invalidos ");
                } else {
                    BigDecimal resBigDecimal = new BigDecimal(res).setScale(2 , RoundingMode.HALF_UP);
                    res = resBigDecimal.doubleValue();
                    if (res < 18.5) {
                        sb.append(" Bajo de Peso, imc : " + res);
                    } else if (res >= 18.5 && res <= 24.5) {
                        sb.append(" NormaL, imc : " + res);
                    } else if (res >= 25.0 && res <= 29.59) {
                        sb.append(" Sobrepeso, imc : " + res);
                    } else if (res > 30.0) {
                        sb.append(" Obesidad, imc : " + res);
                    }
                }
                txtResultado.setText(" "+ sb.toString());

            } catch (Exception ex) {
                txtResultado.setText("Error encontrado, datos invalidos "+ ex.getMessage());

            }

    }

    public void reset(View view) {
        txtNumero1.setText("");
        txtNumero2.setText("");
        txtResultado.setText("");

    }
}
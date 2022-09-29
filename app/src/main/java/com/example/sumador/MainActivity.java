package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv1;
    //Declaración de variables para cada Button
    Button b1;
    Button b2;
    Button b3;
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Identificación de variables para
        //hacer los procesos
        et1 = findViewById(R.id.editTextNumber);
        et2 = findViewById(R.id.editTextNumber2);
        tv1 = findViewById(R.id.textView);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
    }

    /**
     * Método Sumar, el cual cogerá los dos valores introducidos
     * en el EditText y lo sumará
     *
     * @param view
     */
    public void sumar(View view) {
        if (!et1.getText().toString().matches(".*[0-9].*") && !et2.getText().toString().matches(".*[0-9].*")) {
            tv1.setText("Por favor, introduce un número");
        } else {
            // Obtenemos los números
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());

            // Hacemos la suma
            int suma = n1 + n2;
            // Establecemos el resultado en el TextView
            tv1.setText("" + suma);
        }
    }

    /**
     * Método Restar, el cual cogerá los dos valores introducidos
     * en el EditText y los restará
     *
     * @param view
     */
    public void restar(View view) {

        if (!et1.getText().toString().matches(".*[0-9].*") && !et2.getText().toString().matches(".*[0-9].*")) {
            tv1.setText("Por favor, introduce un número");
        } else {
            // Obtenemos los números
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());

            // Hacemos la suma
            int restar = n1 - n2;

            // Establecemos el resultado en el TextView
            tv1.setText("" + restar);
        }
    }

    /**
     * Método Multiplicar, el cual cogerá los dos valores introducidos
     * en el EditText y los multiplicará
     *
     * @param view
     */
    public void multiplicar(View view) {
        if (!et1.getText().toString().matches(".*[0-9].*") && !et2.getText().toString().matches(".*[0-9].*")) {
            tv1.setText("Por favor, introduce un número");
        } else {

            // Obtenemos los números
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());

            // Hacemos la suma
            int multiplicar = n1 * n2;

            // Establecemos el resultado en el TextView
            tv1.setText("" + multiplicar);
        }
    }

    /**
     * Método dividir, el cual cogerá los dos valores introducidos
     * en el EditText y los dividirá
     *
     * @param view
     */
    public void dividir(View view) {
        if (!et1.getText().toString().matches(".*[0-9].*") && !et2.getText().toString().matches(".*[0-9].*")) {
            tv1.setText("Por favor, introduce un número");
        } else {

            // Obtenemos los números
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());


            if (n2 == 0) {
                tv1.setText("ERROR, no se puede dividir por 0");
            } else {
                // Establecemos el resultado en el TextView
                int dividir = n1 / n2;
                tv1.setText("" + dividir);
            }
        }
    }

    /**
     *
     * @param view
     */
    public void clear(View view) {
            et1.setText("");
            et2.setText("");
            tv1.setText("");
        }


    }





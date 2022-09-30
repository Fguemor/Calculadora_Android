package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaración de variables
    EditText et1;
    EditText et2;
    TextView tv1;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    //Método sobreescrito
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
     * en el EditText y lo sumará, controlando con un if/else
     *si no hay números en e1, y et2
     * @param view
     */
    public void sumar(View view) {
        //Utilizo un if/else, y compruebo si en et1 y et2 con el método matches, si contiene algún número,
        //si no contiene número, le muestro un mensaje en tv1.
        if (!et1.getText().toString().matches(".*[0-9].*") && !et2.getText().toString().matches(".*[0-9].*")) {
            tv1.setText("Por favor, introduce un número");
        } else {
            // Obtenemos los números
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());

            // Hacemos la suma
            //declaración e inicializaciónde la variable int
            int suma = n1 + n2;
            // Establecemos el resultado en el TextView
            tv1.setText("" + suma);
        }
    }

    /**
     * Método Restar, el cual cogerá los dos valores introducidos
     * en el EditText y los restará,controlando con un if/else
     * si no hay números en e1, y et2
     * @param view
     */
    public void restar(View view) {
        //Utilizo un if/else, y compruebo si en et1 y et2 con el método matches, si contiene algún número,
        //si no contiene número, le muestro un mensaje en tv1.
        if (!et1.getText().toString().matches(".*[0-9].*") && !et2.getText().toString().matches(".*[0-9].*")) {
            tv1.setText("Por favor, introduce un número");
        } else {
            // Obtenemos los números
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());

            // Hacemos la resta
            //declaración e inicializaciónde la variable int
            int restar = n1 - n2;

            // Establecemos el resultado en el TextView
            tv1.setText("" + restar);
        }
    }

    /**
     * Método Multiplicar, el cual cogerá los dos valores introducidos
     * en el EditText y los multiplicará, controlando con un if/else
     * si no hay números en e1, y et2
     *
     * @param view
     */
    public void multiplicar(View view) {
        //Utilizo un if/else, y compruebo si en et1 y et2 con el método matches, si contiene algún número,
        //si no contiene número, le muestro un mensaje en tv1.
        if (!et1.getText().toString().matches(".*[0-9].*") && !et2.getText().toString().matches(".*[0-9].*")) {
            tv1.setText("Por favor, introduce un número");
        } else {

            // Obtenemos los números
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());

            // Hacemos la multiplicación
            //declarando e inicialilzando una variable int
            int multiplicar = n1 * n2;

            // Establecemos el resultado en el TextView
            tv1.setText("" + multiplicar);
        }
    }

    /**
     * Método dividir, el cual cogerá los dos valores introducidos
     * en el EditText y los dividirá, controlando con un if/else
     * si no hay números en e1, y et2
     *
     * @param view
     */
    public void dividir(View view) {
        //Utilizo un if/else, y compruebo si en et1 y et2 con el método matches, si contiene algún número,
        //si no contiene número, le muestro un mensaje en tv1.
        if (!et1.getText().toString().matches(".*[0-9].*") && !et2.getText().toString().matches(".*[0-9].*")) {
            tv1.setText("Por favor, introduce un número");
        } else {

            // Obtenemos los números
            int n1 = Integer.parseInt(et1.getText().toString());
            int n2 = Integer.parseInt(et2.getText().toString());

            //Utillizo otro if/else, por si intentan dividir un número entre 0
            if (n2 == 0) {
                tv1.setText("ERROR, no se puede dividir por 0");
            } else {
                // Establecemos el resultado en el TextView
                //declarando e inicialilzando una variable int
                //Hacemos la división
                int dividir = n1 / n2;
                tv1.setText("" + dividir);
            }
        }
    }

    /**
     *Método para limpiar et1,et2 y tv1
     * @param view
     */
    public void clear(View view) {
            et1.setText("");
            et2.setText("");
            tv1.setText("");
        }


    }





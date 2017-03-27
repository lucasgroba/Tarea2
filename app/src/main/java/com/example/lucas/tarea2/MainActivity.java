package com.example.lucas.tarea2;

import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    Button mostrar;
    EditText texto;
    TextView pimba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrar = (Button) findViewById(R.id.button);
        texto = (EditText) findViewById(R.id.editText);
        pimba = (TextView) findViewById(R.id.textView);
        mostrar.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v) {
        pimba.setText(texto.getText().toString());




    }
}

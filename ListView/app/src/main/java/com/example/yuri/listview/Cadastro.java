package com.example.yuri.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cadastro extends AppCompatActivity {
    public TextView Texto ;
    public EditText Entrada;
    public Button Botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Texto = (TextView)findViewById(R.id.textView);
        Entrada=(EditText)findViewById(R.id.editText);
        Button=(Button)findViewById(R.id.Cadastrar);
    }
}

package com.example.yuri.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public ListView lista_teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista_teste=(ListView)findViewById(R.id.lista);

        final String[] Teste = new String[]{"1-Vazio","2-Vazio","3-Vazio"};

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,Teste);

        lista_teste.setAdapter(adapter);

        lista_teste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item = position;
                String itemValue = (String)lista_teste.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),"Posicao"+ item + "valor"+ itemValue,Toast.LENGTH_LONG).show();
                
            }
        });
    }
}

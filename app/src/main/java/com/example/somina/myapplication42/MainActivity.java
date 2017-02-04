package com.example.somina.myapplication42;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{

    ListView listView;
    ListViewAdapter listViewAdapter;
    private final static String name[] = {"Anay","Bunny","Chinnu","Danny","Ekkta","Fanny","Granny"};

    private final static String number[] = {"9888778777", "9998778658","9998778234","9987654987","9884562009","8988779977","9968777777"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        listViewAdapter = new ListViewAdapter(this, name, number);
        System.out.println("adapter => "+ listViewAdapter.getCount());
        listView.setAdapter(listViewAdapter);
        listView.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(this,name[position]+"=> "+number[position], Toast.LENGTH_SHORT).show();
    }
}


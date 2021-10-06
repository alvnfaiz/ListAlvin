package com.alvindev.listalvin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {
    ListView listView;
    String[] arrayOS = {"Windows", "Linux", "Solaris", "MacOS", "Android", "iOS", "Windows Mobile", "Symbian"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.listOS);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, R.layout.list_data, arrayOS);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            String item = parent.getItemAtPosition(position).toString();
            Toast.makeText(ListActivity.this, "OS Dipilih: " + item, Toast.LENGTH_SHORT).show();
        });
    }
}
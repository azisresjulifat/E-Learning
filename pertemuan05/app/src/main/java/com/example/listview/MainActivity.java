package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.listview.fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ambil list view dari activity_main.xml
        ListView list=findViewById(R.id.list_view);

        //efinisikan list adapter yang kita buat
        ListAdapter adapter=new ListAdapter(this,createPersons());
        setTitle("App Listview Buah");
        //set adapter pada list view.
        list.setAdapter(adapter);
    }

    /*
     * Untuk menambahkan data pada list
     * silahkan tambahkan datanya di bawah ini
     * contoh: misal kita tambahkan 4 saja dulu.
     */
    private List<fruit> createPersons(){
        List<fruit>data=new ArrayList<>();
        data.add(new fruit(R.drawable.mangga,"Mangga","Rp50.000"));
        data.add(new fruit(R.drawable.jeruk,"Jeruk","Rp.20.000"));

        return data;
    }
}
package com.example.nh.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRv;
    private ArrayList<Contact> contactsData;
    private ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Contact c1 = new Contact("omnia", "hello", R.drawable.ic_launcher_foreground);
        Contact c2 = new Contact("omar", "how are you", R.drawable.ic_launcher_background);
        Contact c3 = new Contact("mahmoud", "hi", R.mipmap.ic_launcher);
        Contact c4 = new Contact("nada", "what about android course?", R.mipmap.ic_launcher_round);
        Contact c5 = new Contact("ahmed", "hello", R.drawable.ic_launcher_background);

        contactsData = new ArrayList<>();
        contactsData.add(c1);
        contactsData.add(c2);
        contactsData.add(c3);
        contactsData.add(c4);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c1);
        contactsData.add(c2);
        contactsData.add(c3);
        contactsData.add(c4);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);
        contactsData.add(c5);

        contactsRv = findViewById(R.id.rv_contacts);
        contactsRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        contactsRv.setLayoutManager(new GridLayoutManager(this,2));
        adapter = new ContactAdapter(this,contactsData);
        contactsRv.setAdapter(adapter);

    }
}

package com.example.markapp.synccontacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    String json_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = findViewById(R.id.listview);

        json_result = getIntent().getExtras().getString("jsonResult");
        List<Contact> contacts = new ArrayList<>();
        try {
            JSONArray contactArray = new JSONArray(json_result);

            for (int i = 0; i < contactArray.length(); i++) {
                JSONObject currentContact = contactArray.getJSONObject(i);
                String name = currentContact.getString("name");
                int phonenumber = currentContact.getInt("phonenumber");
                String birthday = currentContact.getString("birthday");

                Contact contact = new Contact(name, phonenumber, birthday);
                contacts.add(contact);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        ContactAdapter contactAdapter = new ContactAdapter(this, contacts);
        listView.setAdapter(contactAdapter);
    }
}

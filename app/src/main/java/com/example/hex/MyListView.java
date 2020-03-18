package com.example.hex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MyListView extends AppCompatActivity {

        private ListView listview;
        private List<String> list = new ArrayList<String>();
        private ArrayAdapter adapter;
        private ValueEventListener mValueEventListener;

        private FirebaseDatabase mFirebaseDatabase;
        private DatabaseReference mMessagesDatabaseReference;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            mMessagesDatabaseReference = mFirebaseDatabase.getReference();
            System.out.println("RuiLi: existingListActivity onCreate gets called.");
            setContentView(R.layout.activity_my_list_view);
            listview = (ListView)findViewById(R.id.list);
            mMessagesDatabaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    for(DataSnapshot child : dataSnapshot.getChildren()){
                        System.out.println("RuiLi: the value is:"+child.getKey());
                        list.add(child.getKey());
                    }
                    adapter = new ArrayAdapter<String>(MyListView.this, android.R.layout.simple_list_item_1,list);
                    listview.setAdapter(adapter);
                }
                @Override
                public void onCancelled(DatabaseError databaseError) {}
            });

            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String text = listview.getItemAtPosition(position).toString();
                    Intent intent = new Intent(view.getContext(), ChatRoom.class);
                    System.out.println("text: "+text);
                    intent.putExtra("roomID",text);
                    User.addUserToDatabase(text);
                    startActivity(intent);
                }
            });
        }
    }

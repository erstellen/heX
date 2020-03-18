package com.example.hex;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class User {
    public static void addUserToDatabase(String roomName){
        DatabaseReference roomDatabaseReference = FirebaseDatabase.getInstance().getReference().child(roomName);
        DatabaseReference userListDatabaseReference=roomDatabaseReference.child("user_list");
        FirebaseUser mFirebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        String dispalyName = mFirebaseUser.getDisplayName();
        userListDatabaseReference.push().setValue(dispalyName);
}
}


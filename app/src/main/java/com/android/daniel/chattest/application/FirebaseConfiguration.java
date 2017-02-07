package com.android.daniel.chattest.application;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseConfiguration {

    private static DatabaseReference databaseReference;

    private FirebaseConfiguration(){}

    public static DatabaseReference getFirebase(){
        if( databaseReference == null ){
            databaseReference = FirebaseDatabase.getInstance().getReference();
        }
        return( databaseReference );
    }
}


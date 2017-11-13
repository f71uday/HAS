package com.example.vaibhav.iot.utilities;
/**
 * Created by codervs on 17/09/2017.
 */

import android.os.AsyncTask;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Trigger {

    private static String LOG_TAG = Trigger.class.getSimpleName();

    private static String socketAddress;
    private static int PORT_NUMBER = 3000;


    public static void triggerDevice(final String deviceType, final int portNumber, final int task ) {

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        DatabaseReference ipReference = firebaseDatabase.getReference("ip");
        ipReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.i("haha","dataSnapshot.getValue() : " + dataSnapshot.getValue().toString());
                socketAddress = (String) dataSnapshot.getValue();


                Log.i("haha","socketAddress is: " + socketAddress);
                //performing network operation on background thread:

                Client client = new Client("192.168.1.3",portNumber,task);
                client.execute();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
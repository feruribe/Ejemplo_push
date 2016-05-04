package com.ferbajoo.ejemplo_push;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.urbanairship.UAirship;

public class MainActivity extends AppCompatActivity {

    Button mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mensaje = (Button)findViewById(R.id.btn1);

        UAirship.takeOff(getApplication(), new UAirship.OnReadyCallback() {
            @Override
            public void onAirshipReady(UAirship airship) {

                // Enable user notifications
                airship.getPushManager().setUserNotificationsEnabled(true);
                airship.getPushManager().editTags().addTag("android_6").removeTag("").apply();
            }
        });


        mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Fernando Uribe", Toast.LENGTH_SHORT).show();
            }
        });

    }



}

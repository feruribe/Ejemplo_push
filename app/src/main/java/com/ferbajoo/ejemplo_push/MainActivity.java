package com.ferbajoo.ejemplo_push;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.urbanairship.UAirship;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UAirship.takeOff(getApplication(), new UAirship.OnReadyCallback() {
            @Override
            public void onAirshipReady(UAirship airship) {

                // Enable user notifications
                airship.getPushManager().setUserNotificationsEnabled(true);
                airship.getPushManager().editTags().addTag("android_6").removeTag("").apply();
            }
        });



    }



}

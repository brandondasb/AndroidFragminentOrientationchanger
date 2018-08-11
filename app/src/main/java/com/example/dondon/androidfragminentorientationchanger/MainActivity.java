package com.example.dondon.androidfragminentorientationchanger;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
                //allows to interact with different fragment in the activity.
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        // begin the transaction , to allow to add attach detach,remove replace animated transition///


        Configuration configInfo = getResources().getConfiguration() ;
        // to return info about the device configuration
       if( configInfo.orientation == configInfo.ORIENTATION_LANDSCAPE ){
           FragmentLandscape fragmentLandscape = new FragmentLandscape();// calling the fragmentClass
           fragmentTransaction.replace(android.R.id.content,
                   fragmentLandscape);
       }else{
           FragmentPortrait fragmentPortrait= new FragmentPortrait();
           fragmentTransaction.replace(android.R.id.content,
                   fragmentPortrait);
       }
       fragmentTransaction.commit(); //confirm the transaction changes
    }
}

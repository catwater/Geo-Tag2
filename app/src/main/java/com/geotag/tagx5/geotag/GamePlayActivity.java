package com.geotag.tagx5.geotag;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.MapFragment;

public class GamePlayActivity extends FragmentActivity{


    private GoogleApiClient mGoogleApiClient;
    //private Button mButtonUpload;

    @Override
    protected void onStart() {
        //mGoogleApiClient.connect();
        super.onStart();
    }

    @Override
    protected void onStop() {
        //mGoogleApiClient.disconnect();
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_maps);

        FragmentManager fm = getSupportFragmentManager();
        if(fm.findFragmentByTag("HomeFragment")== null)
            fm.beginTransaction()
                    .add(R.id.home_fragment_container, new HomeFragment(), "HomeFragment")
                    .commit();


        //mButtonUpload = (Button) findViewById(R.id.button);
       // mButtonUpload.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                backendlessUser.setProperty("latitude",latBlaster);
//                backendlessUser.setProperty("longitude",longDoink);
//                backendlessUser.setProperty("firstName","poopy");
//                Backendless.UserService.update(backendlessUser, new BackendlessCallback<BackendlessUser>() {
//                    @Override
//                    public void handleResponse(BackendlessUser response) {
//
//                    }
//                });
//                Log.e("ZZOOOBA", "onClick: did it " + backendlessUser.getProperty("firstName") );
//            }
//        });
        Log.e("", "onCreate: ");
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.map);
        if(fm.findFragmentByTag("map")== null)
            fm.beginTransaction()
                    .add(R.id.map, new MapSuperDuperFragment(), "MapSuperDuperFragment")
                    .commit();




    }

}
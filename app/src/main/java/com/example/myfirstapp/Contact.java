package com.example.myfirstapp;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

//
public class Contact extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    /*private  GPSTracker gpsTracker;
    private Location mlocation;
    double latitude, longitude;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        /*gpsTracker = new GPSTracker(getApplicationContext());
        mlocation = gpsTracker.getLocation();

        latitude = mlocation.getLatitude();
        longitude = mlocation.getLongitude();*/

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        /*SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);*/

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        //LatLng sydney = new LatLng(-33.852, 151.211);
        LatLng sydney = new LatLng(7.083861, 100.249637);
        // and move the map's camera to the same location.
       //LatLng sydney = new LatLng(latitude, longitude);
        googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("Marker in Avenger Tower"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
   /*@Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(latitude, longitude);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Kuy Yai Mak"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }*/

}

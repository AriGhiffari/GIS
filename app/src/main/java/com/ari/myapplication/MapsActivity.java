package com.ari.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import android.graphics.Bitmap;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng rumah = new LatLng(-0.9286376540865133, 119.85982921530811);
        LatLng mainan = new LatLng(-0.909960021400669, 119.8634597356547);
        LatLng mainan1 = new LatLng(-0.9230801329635433, 119.86689597626489);
        LatLng mainan2 = new LatLng(-0.9012045121945895, 119.85185361068565);
        LatLng mainan3 = new LatLng(-0.9220191431422629, 119.8698213725644);
        LatLng mainan4 = new LatLng(-0.932480592189222, 119.86148666412396);
        LatLng mainan5 = new LatLng(-0.9087804386807063, 119.87692186358676);
        LatLng mainan6 = new LatLng(-0.899974928460672, 119.85185455043155);
        LatLng mainan7 = new LatLng(-0.8966634794152928, 119.85166948673883);
        LatLng mainan8 = new LatLng(-0.8986245612507672, 119.85982932355446);
        LatLng mainan9 = new LatLng(-0.9002350147880607, 119.87799529931387);
        LatLng mainan10 = new LatLng(-0.9290877829926625, 119.88510474939471);
        LatLng mainan11 = new LatLng(-0.9040489559077542, 119.90760603746797);
        LatLng mainan12 = new LatLng(-0.8843063836427674, 119.87146754572265);
        LatLng mainan13 = new LatLng(-0.8805942863623897, 119.8728046080298);
        LatLng mainan14 = new LatLng(-0.8813389926534002, 119.87925883323295);
        LatLng mainan15 = new LatLng(-0.8490846192884121, 119.88262967248477);

        int tinggi = 100;
        int lebar = 80;
        BitmapDrawable bitmapDraw = (BitmapDrawable)getResources().getDrawable(R.drawable.icon);
        Bitmap b = bitmapDraw.getBitmap();
        Bitmap markerKecil = Bitmap.createScaledBitmap(b, lebar, tinggi, false);
        mMap.addMarker(new MarkerOptions().position(rumah).title("BTN Palupi Permai"));
        mMap.addMarker(new MarkerOptions().position(mainan).title("PADAIDI (Toko Mainan Anak-Anak)")
                .snippet("Jl. Jati")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan1).title("Rumah Boneka Palu")
                .snippet("Jl. I Gusti Ngurah Rai")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan2).title("Toko Mainan Sampurna")
                .snippet("Jl. WR. Supratman")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan3).title("Anora Toyz")
                .snippet("Jl. I Gusti Ngurah Rai")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan4).title("ChilShop21")
                .snippet("Jl. Padat Karya")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan5).title("LA Toys")
                .snippet("Jl. Tanjung Manimbaya")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan6).title("Toko Azka Toys")
                .snippet("Jl. WR. Supratman")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan7).title("Cahaya Baru Toys")
                .snippet("Jl. WR. Supratman")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan8).title("Sumber Mainan Plastik")
                .snippet("Jl. Sis Aljufri")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan9).title("Toko Sahabat")
                .snippet("Jl. G. Watukanjai")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan10).title("Bimo Toys")
                .snippet("Jl. Zebra")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan11).title("Rental Mainan Palu")
                .snippet("Jl. Tekukur")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan12).title("Samrat Toys")
                .snippet("Jl. Sam Ratulangi")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan13).title("Kim Toys")
                .snippet("Jl. Yos Sudarso")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan14).title("Friend Slime")
                .snippet("Jl. Pue Yusu")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addMarker(new MarkerOptions().position(mainan15).title("Toko Imby Boneka")
                .snippet("Jl. Trans Sulawesi")
                .icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.addPolyline(new PolylineOptions().add(
                rumah,
                new LatLng(-0.9286376540865133, 119.85982921530811),
                new LatLng(-0.9287199434681803, 119.86161915329085),
                new LatLng(-0.9249737782968965, 119.8612781064613),
                new LatLng(-0.9225367269671534, 119.86154573904528),
                new LatLng(-0.9227112730997026, 119.86334769630609),
                new LatLng(-0.9215048162650333, 119.86347580945014),
                new LatLng(-0.9182713767570593, 119.8635042264798),
                new LatLng(-0.9177895147983384, 119.8635849618304),
                new LatLng(-0.9156936417046657, 119.8630597274792),
                new LatLng(-0.9127727518530523, 119.86310118718234),
                new LatLng(-0.9127728064681124, 119.86312215874403),
                new LatLng(-0.9101448616263379, 119.86326683456896),
                new LatLng(-0.9099841309958464, 119.86337132265707),
                mainan
                ).width(10)
                        .color(Color.BLUE)
        );

        mMap.moveCamera(CameraUpdateFactory.newLatLng(rumah));
    }
}

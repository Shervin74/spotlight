package com.example.shervin.designtest.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.shervin.designtest.MainMapActivity;
import com.example.shervin.designtest.R;
import com.example.shervin.designtest.WebServices.Advertisments.DataResponse;
import com.example.shervin.designtest.WebServices.Advertisments.Interfaces.DataInterface;
import com.example.shervin.designtest.WebServices.ApiClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookmarkFragment extends Fragment implements
        OnMapReadyCallback,
        GoogleMap.OnPolylineClickListener,
        GoogleMap.OnPolygonClickListener,
        GoogleMap.OnMapClickListener,
        GoogleMap.OnCameraIdleListener,
        GoogleMap.OnMapLongClickListener {


    private GoogleMap mMap;
    Button one, two, three;
    List<Double> coordinate;
    LatLng latLng;
    int typeIds;

    //TextView mTapTextView;


    public BookmarkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View mapView = inflater.inflate(R.layout.fragment_bookmark, container, false);

        //  mTapTextView = (TextView) mapView.findViewById(R.id.tap_tv);

        one = mapView.findViewById(R.id.typeOne);
        two = mapView.findViewById(R.id.typeTwo);
        three = mapView.findViewById(R.id.typeThree);


        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }


        return mapView;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //googleMap.setMinZoomPreference(11);

        Polygon mPolygon = googleMap.addPolygon(new PolygonOptions()
                .add(
                        new LatLng(35.793128, 51.435054),
                        new LatLng(35.785321, 51.435796),
                        new LatLng(35.772827, 51.437989),
                        new LatLng(35.763364, 51.444105),
                        new LatLng(35.760212, 51.434431),
                        new LatLng(35.756451, 51.426640)
                )
                .strokeWidth(9)
                .fillColor(0xa4c88d95));

        mMap.setOnMapClickListener(this);
        mMap.setOnMapLongClickListener(this);
        mMap.setOnCameraIdleListener(this);


        AdvertismentsData();
        }

    @Override
    public void onMapClick(LatLng latLng) {
        String coordinat = "" + latLng;
        //mTapTextView.setText("" + latLng);

        MainMapActivity activity = (MainMapActivity) getActivity();
        activity.sendData(coordinat);

    }

    @Override
    public void onCameraIdle() {
        String Camera = mMap.getCameraPosition().toString();
        // mTapTextView.setText(mMap.getCameraPosition().toString());

        MainMapActivity activity = (MainMapActivity) getActivity();
        activity.sendData(Camera);
    }

    @Override
    public void onMapLongClick(LatLng latLng) {
        String coordinat = "" + latLng;
        // mTapTextView.setText("" + latLng);

        MainMapActivity activity = (MainMapActivity) getActivity();
        activity.sendData(coordinat);

    }

    private void AdvertismentsData() {
        DataInterface dataInterface = ApiClient.getClient().create(DataInterface.class);

        Call<DataResponse> call = dataInterface.getData();

        call.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, final Response<DataResponse> response) {
                if (response.isSuccessful()) {

                    try {

                        for (int i = 0; i < response.body().getDatas().size(); i++) {
                           // coordinate = response.body().getDatas().get(i).getEstate().getLocation().getCoordinates();

                           // typeIds = response.body().getDatas().get(i).getAdvertisementType().getId();
                            //MarkerOptions markerOptions = new MarkerOptions();

                           // latLng = new LatLng(coordinate.get(1), coordinate.get(0));

                            //markerOptions.position(latLng);

//                        if (response.body().getDatas().get(i).getAdvertisementType().getId() == 1) {
//
//                            mMap.addMarker(new MarkerOptions()
//                                    .position(latLng)
//                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
//
//                        }else if (response.body().getDatas().get(i).getAdvertisementType().getId() == 2){
//
//                            mMap.addMarker(new MarkerOptions()
//                                    .position(latLng)
//                                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
//
//                        }else if (response.body().getDatas().get(i).getAdvertisementType().getId() == 3){
//
//                            mMap.addMarker(new MarkerOptions()
//                                    .position(latLng)
//                                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
//
//                        }

                            one.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    mMap.clear();

                                    for (int i = 0; i < response.body().getDatas().size(); i++) {
                                        List<Double> coordinate = response.body().getDatas().get(i).getEstate().getLocation().getCoordinates();
                                        LatLng latLng = new LatLng(coordinate.get(1), coordinate.get(0));
                                        int oneIds = response.body().getDatas().get(i).getAdvertisementType().getId();
                                        if (oneIds == 1) {
                                            mMap.addMarker(new MarkerOptions()
                                                    .position(latLng)
                                                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
                                        }
                                    }
                                }
                            });

                            two.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    mMap.clear();

                                    for (int i = 0; i < response.body().getDatas().size(); i++) {
                                        List<Double> coordinate = response.body().getDatas().get(i).getEstate().getLocation().getCoordinates();
                                        LatLng latLng = new LatLng(coordinate.get(1), coordinate.get(0));
                                        int twoIds = response.body().getDatas().get(i).getAdvertisementType().getId();
                                        if (twoIds == 2) {
                                            mMap.addMarker(new MarkerOptions()
                                                    .position(latLng)
                                                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));
                                        }
                                    }
                                }
                            });

                            three.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    mMap.clear();

                                    for (int i = 0; i < response.body().getDatas().size(); i++) {

                                        coordinate = response.body().getDatas().get(i).getEstate().getLocation().getCoordinates();
                                        latLng = new LatLng(coordinate.get(1), coordinate.get(0));
                                        int threeIds = response.body().getDatas().get(i).getAdvertisementType().getId();
                                        if (threeIds == 3) {
                                            mMap.addMarker(new MarkerOptions()
                                                    .position(latLng)
                                                    .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
                                        }
                                    }
                                }
                            });


                        }

                    } catch (Exception e) {
                        Log.d("onResponse", "There is an error");
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                Toast.makeText(getActivity(), "response is fail", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onPolylineClick(Polyline polyline) {

    }

    @Override
    public void onPolygonClick(Polygon polygon) {

    }

}

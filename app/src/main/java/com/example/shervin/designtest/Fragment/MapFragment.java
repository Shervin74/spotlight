package com.example.shervin.designtest.Fragment;


import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shervin.designtest.Manifest;
import com.example.shervin.designtest.R;
import com.example.shervin.designtest.base.BaseFragment;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CustomCap;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Dot;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.JointType;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends BaseFragment
        implements OnMapReadyCallback,
        GoogleMap.OnPolylineClickListener,
        GoogleMap.OnPolygonClickListener {

    GoogleMap googleMap;
    ArrayList<LatLng> MarkerPoints = null;
    Polyline polyline;
    private boolean checkClick = false;

    private static final int COLOR_BLACK_ARGB = 0xff000000;
    private static final int COLOR_WHITE_ARGB = 0xffffffff;
    private static final int COLOR_GREEN_ARGB = 0xd84315aa;
    private static final int COLOR_PURPLE_ARGB = 0x0d47a155;
    private static final int COLOR_ORANGE_ARGB = 0x90CAf9;
    private static final int COLOR_BLUE_ARGB = 0x90CAf9;

    private static final int POLYLINE_STROKE_WIDTH_PX = 12;
    private static final int POLYGON_STROKE_WIDTH_PX = 8;
    private static final int PATTERN_DASH_LENGTH_PX = 200;
    private static final int PATTERN_GAP_LENGTH_PX = 50;
    private static final PatternItem DOT = new Dot();
    private static final PatternItem DASH = new Dash(PATTERN_DASH_LENGTH_PX);
    private static final PatternItem GAP = new Gap(PATTERN_GAP_LENGTH_PX);
    //
    // Create a stroke pattern of a gap followed by a dot.
    private static final List<PatternItem> PATTERN_POLYLINE_DOTTED = Arrays.asList(GAP, DOT);

    // Create a stroke pattern of a gap followed by a dash.
    private static final List<PatternItem> PATTERN_POLYGON_ALPHA = Arrays.asList(GAP, DASH);

    // Create a stroke pattern of a dot followed by a gap, a dash, and another gap.
    private static final List<PatternItem> PATTERN_POLYGON_BETA =
            Arrays.asList(DOT, GAP, DASH, GAP);

    private static final List<PatternItem> PATTERN_POLYGON_LINE =
            Arrays.asList(DASH);


    public MapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_map, container, false);


//        SupportMapFragment mapFragment = (SupportMapFragment) getFragmentManager().findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);

        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager()
                .findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }

        MarkerPoints = new ArrayList<>();


        TextView textView = rootview.findViewById(R.id.textView);
        Toast.makeText(getActivity().getApplicationContext(), "clicked", Toast.LENGTH_SHORT).show();


        return rootview;
    }

    /**
     * ----------onMapReady----------
     **/
    @Override
    public void onMapReady(final GoogleMap googleMap) {

        googleMap.setMinZoomPreference(11);

        final LatLng mellatpark = new LatLng(35.777514, 51.409862);
        googleMap.addMarker(new MarkerOptions().position(mellatpark)
                .title("Marker in Mellat Park"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(mellatpark));

        final LatLng work = new LatLng(35.764412, 51.419581);
        googleMap.addMarker(new MarkerOptions().position(work)
                .title("This is my workplace"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(work));

        LatLng seul = new LatLng(35.776575, 51.390797);
        googleMap.addMarker(new MarkerOptions().position(seul)
                .title("seul highway"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(seul));

//        Polygon polygon = googleMap.addPolygon(new PolygonOptions()
//                .add(
//                        new LatLng(35.777514, 51.409862),
//                        new LatLng(35.764412, 51.419581),
//                        new LatLng(35.776575, 51.390797)));
//        polygon.setTag("beta");
//        polygonStyle(polygon);

//        Polygon polygon1 = googleMap.addPolygon(new PolygonOptions()
//                .clickable(true)
//                .add(
//                        new LatLng(35.777514, 51.409862),
//                        new LatLng(35.764412, 51.419581),
//                        new LatLng(35.776575, 51.390797)));
//        // Store a data object with the polygon, used here to indicate an arbitrary type.
//        polygon1.setTag("alpha");
//        // Style the polygon.
//        polygonStyle(polygon1);


        /**_____________________________________________________________________**/

        googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {
            @Override
            public void onMapClick(LatLng latLng) {

                MarkerPoints.add(latLng);

                // Creating MarkerOptions
                MarkerOptions options = new MarkerOptions();

                // Setting the position of the marker
                options.position(latLng);


//                // Already two locations
//                if (MarkerPoints.size() > 1){
//                    MarkerPoints.clear();
//                    googleMap.clear();
//                }
//
                // Adding new item to the ArrayList
                Polygon polygon = googleMap.addPolygon(new PolygonOptions()
                        .addAll(MarkerPoints));

                if (MarkerPoints.size() == 1) {
                    options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN));
                } else if (MarkerPoints.size() == 2) {
                    options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
                } else if (MarkerPoints.size() == 3) {
                    options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
                } else if (MarkerPoints.size() == 4) {
                    options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
                }

                // Add new marker to the Google Map Android API V2
                googleMap.addMarker(options);

                stylePolygon(polygon);

                if (MarkerPoints.size() >= 4) {
                    polygon.getPoints();
                    googleMap.clear();
                    googleMap.addMarker(options);
                    stylePolygon(polygon);
                    polygon.setPoints(MarkerPoints);
                }


//
//                // Checks, whether start and end locations are captured
//                if (MarkerPoints.size() >= 2){
//                    LatLng origin = MarkerPoints.get(0);
//                    LatLng dest = MarkerPoints.get(1);
//
//                    // Getting URL to the Google Directions API
//                    String url = getUrl(origin,dest);
//                    Log.d("onMapReady", url.toString());
//                    FetchUrl fetchUrl = new FetchUrl();
//
//                    // Start downloading json data from Google Directions API
//                    fetchUrl.execute(url);
//
//                    googleMap.moveCamera(CameraUpdateFactory.newLatLng(origin));
//                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(11));
//                }
            }
        });

//        points = new ArrayList<LatLng>();

//        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
//                .clickable(true)
//                .add(
//                        mellatpark,
//                        work,
//                        seul
//                ));
//        polyline1.setTag("A");
//        stylePolyline(polyline1);
//
//        Polyline polyline2 = googleMap.addPolyline(new PolylineOptions()
//                .clickable(true)
//                .add(
//                        new LatLng(35.790873, 51.403230),
//                        new LatLng(35.789758, 51.409968),
//                        new LatLng(35.781611, 51.399540),
//                        new LatLng(35.781471, 51.408552),
//                        new LatLng(35.786936, 51.415418)
//                ));
//        polyline2.setTag("B");
//        stylePolyline(polyline2);
//
//
//        googleMap.setOnPolylineClickListener(this);

    }


    /**-----------get Url-----------**/
//    private String getUrl(LatLng origin, LatLng dest) {
//
//        //origin of route
//        String str_origin = "origin = " + origin.latitude + "," + origin.longitude;
//
//        //Destination of route
//        String str_dest = "destination = " + dest.latitude + "," + dest.longitude;
//
//        //Sensor enabled
//        String sensor = "sensor=false";
//
//        //Building the parameters to the web service
//        String parameteres = str_origin + "&" + str_dest + "&" + sensor;
//
//        //Output format
//        String output = "json";
//
//        //Building the url to the web service
//        String url = "https://nearlocation.ir/api/directions/document.json" + output + "?" + parameteres;
//
//        return url;
//    }

    /**
     * -----------Polyline------------
     **/
    @Override
    public void onPolylineClick(Polyline polyline) {

    }

    /**
     * -----------Ploygon------------
     **/
    @Override
    public void onPolygonClick(Polygon polygon) {

    }

    public void polygonStyle(Polygon polygon) {

        String type = "";
        // Get the data object stored with the polygon.
        if (polygon.getTag() != null) {
            type = polygon.getTag().toString();
        }

        List<PatternItem> pattern = null;
        int strokeColor = COLOR_BLACK_ARGB;
        int fillColor = COLOR_WHITE_ARGB;

        switch (type) {
            // If no type is given, allow the API to use the default.
            case "alpha":
                // Apply a stroke pattern to render a dashed line, and define colors.
                pattern = PATTERN_POLYGON_ALPHA;
                strokeColor = COLOR_GREEN_ARGB;
                fillColor = COLOR_PURPLE_ARGB;
                break;
            case "beta":
                // Apply a stroke pattern to render a line of dots and dashes, and define colors.
                pattern = PATTERN_POLYGON_BETA;
                strokeColor = COLOR_ORANGE_ARGB;
                fillColor = COLOR_BLUE_ARGB;
                break;
        }
        polygon.setStrokePattern(pattern);
        polygon.setStrokeWidth(POLYGON_STROKE_WIDTH_PX);
        polygon.setStrokeColor(strokeColor);
        polygon.setFillColor(fillColor);

//        if (MarkerPoints.size() >= 3) {

//            polygon.setStrokePattern(pattern);
//            polygon.setStrokeWidth(8);
//            polygon.setStrokeColor(0x90caf9);
//            polygon.setFillColor(0x90caf9);
//            PolygonOptions polygonOptions = new PolygonOptions()
//                    .addAll(MarkerPoints)
//                    .strokeColor(0x2196f3)
//                    .strokeWidth(7)
//                    .fillColor(0x90caf9);
//            Polygon polygon = googleMap.addPolygon(polygonOptions);
//            polygon.setStrokePattern(pattern);
//        }
    }

    public void stylePolygon(Polygon polygon) {

        if (MarkerPoints.size() >= 3) {
            List<PatternItem> pattern = null;
            int strokeColor = COLOR_BLACK_ARGB;
            int fillColor = COLOR_WHITE_ARGB;

            pattern = PATTERN_POLYGON_LINE;
            strokeColor = COLOR_GREEN_ARGB;
            fillColor = COLOR_PURPLE_ARGB;

            polygon.setStrokePattern(pattern);
            polygon.setStrokeWidth(POLYGON_STROKE_WIDTH_PX);
            polygon.setStrokeColor(strokeColor);
            polygon.setFillColor(fillColor);

        }
    }

//    private void stylePolyline(Polyline polyline) {
//        String type = "";
//        // Get the data object stored with the polyline.
//        if (polyline.getTag() != null) {
//            type = polyline.getTag().toString();
//        }
//
//        switch (type) {
//            // If no type is given, allow the API to use the default.
//            case "A":
//                // Use a custom bitmap as the cap at the start of the line.
//                polyline.setStartCap(
//                               new RoundCap());
//                break;
//            case "B":
//                // Use a round cap at the start of the line.
//                polyline.setStartCap(new RoundCap());
//                break;
//        }
//
//        polyline.setEndCap(new RoundCap());
//        polyline.setWidth(POLYLINE_STROKE_WIDTH_PX);
//        polyline.setColor(COLOR_BLACK_ARGB);
//        polyline.setJointType(JointType.ROUND);
//    }

}

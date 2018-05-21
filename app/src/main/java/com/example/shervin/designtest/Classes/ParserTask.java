//package com.example.shervin.designtest.Classes;
//
//import android.graphics.Color;
//import android.os.AsyncTask;
//import android.util.Log;
//
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.PolylineOptions;
//
//import org.json.JSONObject;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Created by shervin on 3/11/18.
// */
//
//public class ParserTask extends AsyncTask<String, Integer, List<List<HashMap<String, String>>>> {
//
//    GoogleMap googleMap;
//    @Override
//    protected List<List<HashMap<String, String>>> doInBackground(String... jsonData) {
//
//        JSONObject object;
//
//        List<List<HashMap<String, String>>> routes = null;
//
//        try {
//            object = new JSONObject(jsonData[0]);
//            Log.d("ParserTask", jsonData[0].toString());
//            DataParser parser = new DataParser();
//            Log.d("parserTask", parser.toString());
//
//            //starts parsing data
//            routes = parser.parse(object);
//            Log.d("ParserTask","Executing routes");
//            Log.d("ParserTask", routes.toString());
//
//        }catch (Exception e){
//            Log.d("ParserTask", e.toString());
//            e.printStackTrace();
//        }
//
//        return routes;
//    }
//
//    // Executes in UI thread, after the parsing process
//    @Override
//    protected void onPostExecute(List<List<HashMap<String, String>>> result) {
//
//        ArrayList<LatLng> points;
//        PolylineOptions options = null;
//
//        // Traversing through all the routes
//        try {
//            for (int i = 0; i < result.size(); i++){
//                points = new ArrayList<>();
//                options = new PolylineOptions();
//
//                // Fetching i-th route
//                List<HashMap<String, String>> path = result.get(i);
//
//                // Fetching all the points in i-th route
//                for (int j = 0; j < path.size(); j++){
//                    HashMap<String, String> point = path.get(j);
//
//                    double lat = Double.parseDouble(point.get("lat"));
//                    double lng = Double.parseDouble(point.get("lng"));
//                    LatLng position = new LatLng(lat,lng);
//
//                    points.add(position);
//                }
//
//                // Adding all the points in the route to LineOptions
//                options.addAll(points);
//                options.width(10);
//                options.color(Color.RED);
//
//                Log.d("onPostExecute","onPostExecute lineOptions decoded");
//            }
//        }catch (Exception e){
//            Log.d("Exception", e.toString());
//            e.printStackTrace();
//        }
//
//        if (options != null){
//            googleMap.addPolyline(options);
//        }else {
//            Log.d("onPostExecute","without Polylines drawn");
//        }
//
//    }
//}

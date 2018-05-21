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
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
///**
// * Created by shervin on 3/11/18.
// */
//
//// Fetches data from url passed
//public class FetchUrl extends AsyncTask<String, Void, String> {
//    @Override
//    protected String doInBackground(String... url) {
//
//        //For storing data from web service
//        String data = "";
//
//        try {
//            //Fetching the data from web service
//            data = downloadUrl(url[0]);
//            Log.d("Background task data", data.toString());
//        }catch (Exception e){
//            Log.d("Background task", e.toString());
//        }
//        return data;
//
//
//    }
//
//    /**
//     * A method to download json data from url
//     */
//    @Override
//    protected void onPostExecute(String result) {
//        super.onPostExecute(result);
//
//        ParserTask parserTask = new ParserTask();
//
//        // Invokes the thread for parsing the JSON data
//        parserTask.execute(result);
//    }
//
//    private String downloadUrl(String strUrl) throws IOException {
//        String data = "";
//        InputStream stream = null;
//        HttpURLConnection urlConnection = null;
//
//        try {
//            URL url = new URL(strUrl);
//
//            // Creating an http connection to communicate with url
//            urlConnection = (HttpURLConnection) url.openConnection();
//
//            // Connecting to url
//            urlConnection.connect();
//
//            // Reading data from url
//            stream = urlConnection.getInputStream();
//
//            BufferedReader br = new BufferedReader(new InputStreamReader(stream));
//
//            StringBuffer sb = new StringBuffer();
//
//            String line = "";
//            while ((line = br.readLine()) != null){
//                sb.append(line);
//            }
//            data = sb.toString();
//            Log.d("downloadUrl", data.toString());
//            br.close();
//        }catch (Exception e){
//            Log.d("Exception", e.toString());
//        }finally {
//            stream.close();
//            urlConnection.disconnect();
//        }
//        return data;
//    }
//}
//

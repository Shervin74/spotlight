package com.example.shervin.designtest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.PorterDuff.Mode;

import com.example.shervin.designtest.Fragment.AccountFragment;
import com.example.shervin.designtest.Fragment.AdvertisListFragment;
import com.example.shervin.designtest.Fragment.BookmarkFragment;
import com.example.shervin.designtest.Fragment.MapFragment;
import com.example.shervin.designtest.Fragment.SearchFragment;
import com.example.shervin.designtest.base.BaseActivity;
import com.google.android.gms.maps.model.LatLng;

public class MainMapActivity extends BaseActivity{

    BottomNavigationView bottomNavigationView;
    Button button, btnDraw, btnTest;
    LinearLayout linearLayout;
    ImageView imgLoc;
    TextView mTapTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_map);

       // mTapTextView = (TextView) findViewById(R.id.tap_text);
        linearLayout = (LinearLayout) findViewById(R.id.linearActionBar);
        imgLoc = (ImageView) findViewById(R.id.imgBtnLoc);
        btnDraw = (Button) findViewById(R.id.btnDraw);
        btnTest = (Button) findViewById(R.id.button2);


        FragmentManager bmManager = getSupportFragmentManager();
        FragmentTransaction bmTransaction = bmManager.beginTransaction();
        BookmarkFragment bookmarkFragment = new BookmarkFragment();
        bmTransaction.add(R.id.relativeLayout, bookmarkFragment).commit();


//        FragmentManager fragmentManager1 = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
//        MapFragment searchFragment = new MapFragment();
//        fragmentTransaction1.add(R.id.relativeLayout, searchFragment).commit();
        //this code for map fragment---------------------------------------------
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);
        //_______________________________________________________________________________________


        button = (Button)findViewById(R.id.button2);

        // this section for bottom navigation view -----------------------------------------
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.acction_account:
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                        AccountFragment fragment = new AccountFragment();
                        fragmentTransaction.add(R.id.relativeLayout, fragment).commit();
                        break;

                    case R.id.action_search:
                        FragmentManager manager = getSupportFragmentManager();
                        FragmentTransaction transaction = manager.beginTransaction();
                        MapFragment mapFragment = new MapFragment();
                        transaction.add(R.id.relativeLayout, mapFragment).commit();

                        //for color icon Location
                        Resources res = getApplicationContext().getResources();
                        int newColor = res.getColor(R.color.colorPrimary);
                        imgLoc.setColorFilter(newColor, Mode.SRC_ATOP);
                        break;

                    case R.id.action_bookmark:
                        FragmentManager bmManager = getSupportFragmentManager();
                        FragmentTransaction bmTransaction = bmManager.beginTransaction();
                        BookmarkFragment bookmarkFragment = new BookmarkFragment();
                        bmTransaction.add(R.id.relativeLayout, bookmarkFragment).commit();
                        break;

                }
                return true;
            }
        });
       //______________________________________________________________________________________

    }

    public void btnLocListener(View view){
        Toast.makeText(this, "Location Clicked", Toast.LENGTH_SHORT).show();

        //if choose the button, show map
        FragmentManager fragmentManager1 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
        MapFragment searchFragment = new MapFragment();
        fragmentTransaction1.add(R.id.relativeLayout, searchFragment).commit();

        //if choosing search or clicked this button, change the color
        Resources res = getApplicationContext().getResources();
        int newColor = res.getColor(R.color.colorPrimary);
        imgLoc.setColorFilter(newColor, Mode.SRC_ATOP);
    }

    public void btnAdvertisListener(View view){
        Toast.makeText(this, "Location List Clicked", Toast.LENGTH_SHORT).show();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        AdvertisListFragment advertisListFragment = new AdvertisListFragment();
        fragmentTransaction.add(R.id.relativeLayout, advertisListFragment).commit();
        btnDraw.setVisibility(View.INVISIBLE);
        btnTest.setVisibility(View.INVISIBLE);

    }

    /**
     * for pass data from fragment to activity
     * @param s1
     */
    public void sendData(String s1){
        mTapTextView = (TextView) findViewById(R.id.tap_text);
        mTapTextView.setText(s1);
    }

}

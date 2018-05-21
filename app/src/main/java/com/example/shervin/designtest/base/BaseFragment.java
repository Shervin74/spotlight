package com.example.shervin.designtest.base;

import android.support.v4.app.Fragment;
import android.widget.Toast;

public class BaseFragment extends Fragment {


    public BaseFragment() {
    }

    public void toast(String message){
        Toast.makeText(getContext(), message , Toast.LENGTH_SHORT).show();
    }

}

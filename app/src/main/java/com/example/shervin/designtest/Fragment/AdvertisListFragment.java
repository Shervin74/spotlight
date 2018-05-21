package com.example.shervin.designtest.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.shervin.designtest.R;
import com.example.shervin.designtest.WebServices.Advertisments.DataResponse;
import com.example.shervin.designtest.WebServices.Advertisments.Interfaces.DataInterface;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Data;
import com.example.shervin.designtest.WebServices.ApiClient;
import com.example.shervin.designtest.adapters.MyRecyclerAdapterAdvertismentList;
import com.example.shervin.designtest.base.BaseFragment;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdvertisListFragment extends BaseFragment {

    View view;

    private RecyclerView recyclerView;
    private MyRecyclerAdapterAdvertismentList adapterAdvertismentList;
    private LinearLayoutManager linearLayoutManager;

    public AdvertisListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_advertis_list, container, false);

        AdvertismentData();

        return view;
    }

    private void AdvertismentData(){
        DataInterface dataInterface = ApiClient.getClient().create(DataInterface.class);

        Call<DataResponse> call = dataInterface.getData();

        call.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                if (response.isSuccessful()){
                    List<Data> dataList = response.body().getDatas();
                    setUpRecyclerView(dataList);
                }
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                Log.e("ERROR", t.getMessage());
                Toast.makeText(getActivity(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void setUpRecyclerView(List<Data> datas){
        recyclerView = view.findViewById(R.id.advertisRecycler);
        adapterAdvertismentList = new MyRecyclerAdapterAdvertismentList(this, datas);
        linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setAdapter(adapterAdvertismentList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

}

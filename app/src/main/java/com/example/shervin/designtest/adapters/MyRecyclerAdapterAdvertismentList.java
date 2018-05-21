package com.example.shervin.designtest.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shervin.designtest.Fragment.AdvertisListFragment;
import com.example.shervin.designtest.R;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Data;
import com.example.shervin.designtest.WebServices.Advertisments.Model.Filter.Estate_info.FirstImage;
import com.example.shervin.designtest.base.App;

import java.util.List;

public class MyRecyclerAdapterAdvertismentList extends RecyclerView.Adapter<MyRecyclerAdapterAdvertismentList.MyViewHolder> {

    private List<Data> datas;

    private final String URL = "https://stable.mohammad.inpin.co/api/";
    List<FirstImage> firstImages;
    private AdvertisListFragment context;

    public MyRecyclerAdapterAdvertismentList(AdvertisListFragment context, List<Data> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(App.getContext()).inflate(R.layout.layout_custom_recycler_advertisment_list, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tvArea.setText(String.valueOf(datas.get(position).getEstate().getArea()));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgAdvertismentList;
        private TextView tvPrice;
        private TextView tvArea;
        private TextView tvTime;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgAdvertismentList = itemView.findViewById(R.id.imgAdvertismentList);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvArea = itemView.findViewById(R.id.tvArea);
            tvTime = itemView.findViewById(R.id.tvTime);
        }

    }
}

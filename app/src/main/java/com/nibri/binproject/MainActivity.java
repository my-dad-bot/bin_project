package com.nibri.binproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.nibri.binproject.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PassThrough {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        initCouponView();
        initServiceList();
        initStat();
    }

    private void initServiceList() {
        binding.serviceList.setLayoutManager(new GridLayoutManager(this, 4));
        List<ServiceList> data = new ArrayList<>();

        for (int i = 0; i < 7; i++){
          data.add(getModelWithMore());
        }


        ServiceListAdapter adapter = new ServiceListAdapter(data, this, this);
        //binding.serviceList.addItemDecoration(new HorizontalSpaceItemDecoration(Utils.dpToPixel(this, 16)));
        binding.serviceList.setAdapter(adapter);

    }

    private void initStat() {
        binding.recyclerViewMileStone.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<StatData> data = new ArrayList<>();
        data.add(new StatData("url", "300+ order from Star Kabab during last week"));
        data.add(new StatData("url", "300+ order from Star Kabab during last week"));
        data.add(new StatData("url", "300+ order from Star Kabab during last week"));
        data.add(new StatData("url", "300+ order from Star Kabab during last week"));


        StatisticsAdapter adapter = new StatisticsAdapter(data);
        binding.recyclerViewMileStone.setAdapter(adapter);
        binding.recyclerViewMileStone.addItemDecoration(new CustomItemDivider(this, CustomItemDivider.HORIZONTAL_LIST));
        binding.recyclerViewMileStone.addItemDecoration(new HorizontalSpaceItemDecoration(Utils.dpToPixel(this, 16)));


    }

    private void initCouponView() {
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        List<CouponData> data = new ArrayList<>();
        data.add(new CouponData("food", "৳100 Off", "On your first order with <font color=#ffffff><b>bKAsh</b></font> payment", "Bijoy21"));
        data.add(new CouponData("bus", "25% Off", "On your first order with <font color=#ffffff><b>bKAsh</b></font> payment", "Bijoy21"));
        data.add(new CouponData("lunch", "৳100 Off", "On your first order with <font color=#ffffff><b>bKAsh</b></font> payment", "Bijoy21"));
        data.add(new CouponData("bus", "৳100 Off", "On your first order with <font color=#ffffff><b>bKAsh</b></font> payment", "Bijoy21"));
        data.add(new CouponData("bus", "৳100 Off", "On your first order with <font color=#ffffff><b>bKAsh</b></font> payment", "Bijoy21"));

        HorizontalRecyclerAdapter adapter = new HorizontalRecyclerAdapter(data);
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.addItemDecoration(new HorizontalSpaceItemDecoration(Utils.dpToPixel(this, 16)));
    }

    ServiceList getModelWithMore() {

        ServiceList model = new ServiceList();
        model.setServiceId(0);
        model.setServiceName("");
        model.setIsServiceAvailable(true);
        model.setServiceIconEN("");
        model.setServiceIconBN("");
        model.setServiceUnavailableIconEN("");
        model.setServiceUnavailableIconBN("");
        model.setServiceType("");
        model.setServiceUnavailableMsgEN("");
        model.setServiceUnavailableMsgBN("");
        model.setServiceHTTPHeader("");
        model.setIsAuthRequired(false);
        model.setServiceAvailable(true);
        model.setAuthRequired(false);
        model.setNativeBridgeUrl("");
        model.setServiceURL("");
        model.setServiceScope("");
        model.setMoreAvailable(true);

        return model;
    }

    ServiceList getModelWithOutMore() {
        ServiceList model = new ServiceList();
        model.setServiceId(0);
        model.setServiceName("");
        model.setIsServiceAvailable(true);
        model.setServiceIconEN("");
        model.setServiceIconBN("");
        model.setServiceUnavailableIconEN("");
        model.setServiceUnavailableIconBN("");
        model.setServiceType("");
        model.setServiceUnavailableMsgEN("");
        model.setServiceUnavailableMsgBN("");
        model.setServiceHTTPHeader("");
        model.setIsAuthRequired(false);
        model.setServiceAvailable(true);
        model.setAuthRequired(false);
        model.setNativeBridgeUrl("");
        model.setServiceURL("");
        model.setServiceScope("");
        model.setMoreAvailable(false);

        return model;
    }


    @Override
    public void object() {

    }
}

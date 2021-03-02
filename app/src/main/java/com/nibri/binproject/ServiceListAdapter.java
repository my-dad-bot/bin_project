package com.nibri.binproject;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.nibri.binproject.databinding.ItemServicelistBinding;

import java.util.List;

public class ServiceListAdapter extends RecyclerView.Adapter<ServiceListAdapter.ViewHolder> {

    List<ServiceList> serviceLists;
    Context context;
    private static final String TAG = "ServiceListAdapter";
    PassThrough listener;

    public ServiceListAdapter(List<ServiceList> serviceLists, Context context, PassThrough listener) {
        this.serviceLists = serviceLists;
        this.context = context;
        this.listener = listener;

    }

    @NonNull
    @Override
    public ServiceListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemServicelistBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_servicelist, parent, false);
        return new ServiceListAdapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceListAdapter.ViewHolder holder, int position) {
        if (serviceLists.get(position).isMoreAvailable()){
            holder.binding.AppCompatImageViewServiceMore.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return serviceLists.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ItemServicelistBinding binding;

        public ViewHolder(ItemServicelistBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

package com.example.location_fetcher6;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private List<LocationData> locations;

    public RecyclerViewAdapter(List<LocationData> locations) {
        this.locations = locations;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        LocationData location = locations.get(position);
        holder.longitudeTextView.setText(String.valueOf(location.getLongitude()));
        holder.latitudeTextView.setText(String.valueOf(location.getLatitude()));
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView longitudeTextView;
        public TextView latitudeTextView;

        public ViewHolder(View view) {
            super(view);
            longitudeTextView = view.findViewById(R.id.latitude);
            latitudeTextView = view.findViewById(R.id.longitude);
        }
    }
}

package com.example.covidtracker2019.ui.Country;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.covidtracker2019.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList<CovidCountry> covidCountries;

    public Adapter(ArrayList<CovidCountry> covidCountries){
        this.covidCountries = covidCountries;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()) .inflate(R.layout.item_list_covid_country,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
    CovidCountry covidCountry = covidCountries.get(position);
    holder.tvtotalcases.setText(covidCountry.getMcases());
    holder.tvcountryname.setText(covidCountry.getMcovidcountry());
    }

    @Override
    public int getItemCount() {
        return covidCountries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvtotalcases,tvcountryname;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvtotalcases = itemView.findViewById(R.id.tvtotalcases);
            tvcountryname = itemView.findViewById(R.id.tvcountryname);
        }
    }
}



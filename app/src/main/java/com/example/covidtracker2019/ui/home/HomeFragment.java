package com.example.covidtracker2019.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.covidtracker2019.R;

public class HomeFragment extends Fragment {
    private  TextView tvtotalconfirm,tvtotaldeath,tvtotalrecovered;
    private ProgressBar progressBar;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        tvtotalconfirm = root.findViewById(R.id.txttotalconfirmed);
        tvtotaldeath = root.findViewById(R.id.txttotaldeaths);
        tvtotalrecovered = root.findViewById(R.id.txttotalRecovered);
        progressBar = root.findViewById(R.id.progress_circular_home);
        getData();
        return root;
    }

    private void getData() {
        RequestQueue queue= Volley.newRequestQueue(getActivity());
        
    }
}

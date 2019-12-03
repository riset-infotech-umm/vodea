package com.infotech.riset.vodea.Home.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.infotech.riset.vodea.Home.ui.RecyclerViewHome.ListHomeAdapter;
import com.infotech.riset.vodea.Home.ui.RecyclerViewHome.VoteData;
import com.infotech.riset.vodea.Home.ui.RecyclerViewHome.VoteModel;
import com.infotech.riset.vodea.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView rvHome;
    private ArrayList<VoteModel> list = new ArrayList<>();
    private  View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        //set Recyclce View Home
        setRecyclceViewHome();
        return root;
    }

    private void setRecyclceViewHome() {
        rvHome = root.findViewById(R.id.rvHome);
        list.addAll(VoteData.getData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHome.setLayoutManager( new LinearLayoutManager(this.getActivity()));
        ListHomeAdapter listHomeAdapter= new ListHomeAdapter(list);
        rvHome.setAdapter(listHomeAdapter);

    }
}
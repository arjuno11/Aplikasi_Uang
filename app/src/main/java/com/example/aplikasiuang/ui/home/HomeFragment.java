package com.example.aplikasiuang.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplikasiuang.Adapter;
import com.example.aplikasiuang.List;
import com.example.aplikasiuang.MainActivity;
import com.example.aplikasiuang.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private Adapter adapter;
    private ArrayList<List> itemArrayList;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

//        return root;
        addData();
        final FragmentActivity c = getActivity();
        final RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(layoutManager);

        new Thread(new Runnable() {
            @Override
            public void run() {
                final Adapter adapter = new Adapter(itemArrayList);
                c.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        recyclerView.setAdapter(adapter);
                    }
                });
            }
        }).start();

        return root;
    }

    void addData(){
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new List("21 februari 2020", "Rp 30000", "Rp 20000", "10000"));
        itemArrayList.add(new List("22 februari 2020", "Rp 30000", "Rp 20000", "10000"));
        itemArrayList.add(new List("23 februari 2020", "Rp 30000", "Rp 20000", "10000"));
        itemArrayList.add(new List("24 februari 2020", "Rp 30000", "Rp 20000", "10000"));
    }
}
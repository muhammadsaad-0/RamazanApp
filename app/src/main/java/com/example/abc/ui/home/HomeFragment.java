package com.example.abc.ui.home;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abc.R;
import com.example.abc.RecyclerContactAdapter;
import com.example.abc.databinding.FragmentHomeBinding;
import com.example.abc.eps;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    Activity table;
    ArrayList<eps> arraycontact = new ArrayList<>();
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;


    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        table= getActivity();

    }

    @Override
    public void onStart() {
        super.onStart();
        RecyclerView k = (RecyclerView)table.findViewById(R.id.recycle);
        k.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        arraycontact.add(new eps("Date", "Suhoor", "Aftaar"));
        arraycontact.add(new eps("03 April ", "04:30AM", "06:35PM"));
        arraycontact.add(new eps("04 April ", "04:29AM", "06:36PM"));
        arraycontact.add(new eps("05 April ", "04:28AM", "06:37PM"));
        arraycontact.add(new eps("06 April ", "04:27AM", "06:38PM"));
        arraycontact.add(new eps("07 April ", "04:26AM", "06:39PM"));
        arraycontact.add(new eps("08 April ", "04:25AM", "06:40PM"));
        arraycontact.add(new eps("09 April ", "04:24AM", "06:41PM"));
        arraycontact.add(new eps("10 April ", "04:23AM", "06:42PM"));
        arraycontact.add(new eps("11 April ", "04:22AM", "06:43PM"));
        arraycontact.add(new eps("12 April ", "04:21AM", "06:44PM"));
        arraycontact.add(new eps("13 April ", "04:20AM", "06:45PM"));
        arraycontact.add(new eps("14 April ", "04:19AM", "06:46PM"));
        arraycontact.add(new eps("15 April ", "04:18AM", "06:47PM"));
        arraycontact.add(new eps("16 April ", "04:17AM", "06:48PM"));
        arraycontact.add(new eps("17 April ", "04:16AM", "06:49PM"));
        arraycontact.add(new eps("18 April ", "04:15AM", "06:50PM"));
        arraycontact.add(new eps("19 April ", "04:14AM", "06:51PM"));
        arraycontact.add(new eps("20 April ", "04:13AM", "06:53PM"));
        arraycontact.add(new eps("21 April ", "04:12AM", "06:54PM"));
        arraycontact.add(new eps("22 April ", "04:11AM", "06:59PM"));
        arraycontact.add(new eps("23 April ", "04:10AM", "06:35PM"));
        arraycontact.add(new eps("24 April ", "04:09AM", "06:35PM"));
        arraycontact.add(new eps("25 April ", "04:08AM", "07:00PM"));
        arraycontact.add(new eps("26 April ", "04:07AM", "07:02PM"));
        arraycontact.add(new eps("27 April ", "04:06AM", "06:03PM"));
        arraycontact.add(new eps("28 April ", "04:05AM", "06:04PM"));
        arraycontact.add(new eps("29 April ", "04:02AM", "07:05PM"));
        arraycontact.add(new eps("30 April ", "04:01AM", "07:06PM"));
        arraycontact.add(new eps("31 April ", "03:56AM", "07:07PM"));
        arraycontact.add(new eps("01 May ", "03:54AM", "07:08PM"));
        arraycontact.add(new eps("01 May ", "03:53AM", "07:09PM"));
        RecyclerContactAdapter adapter = new RecyclerContactAdapter(getActivity().getApplicationContext(), arraycontact);
        k.setAdapter(adapter);

    };


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}
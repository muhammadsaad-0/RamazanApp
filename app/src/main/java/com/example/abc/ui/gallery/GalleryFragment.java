package com.example.abc.ui.gallery;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.abc.R;
import com.example.abc.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
Activity table;
    int index=0;
    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
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
        ImageView backimg =(ImageView) table.findViewById(R.id.backimg);
        ImageView nextimg =(ImageView) table.findViewById(R.id.nextimg);
        TextView  ans =(TextView) table.findViewById(R.id.anstxt);
        String []  simple_name=getResources().getStringArray(R.array.ques);

        ans.setText(simple_name[index]);

        backimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0) {
                    Toast.makeText(getActivity().getApplicationContext(),"No More Previous",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    index--;
                    ans.setText(simple_name[index]);
                }
            }
        });
                nextimg.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(index== simple_name.length-1) {
                            Toast.makeText(getActivity().getApplicationContext(),"Names Ended:",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            index++;
                            ans.setText(simple_name[index]);
                        }
                    }
                });

        };


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}
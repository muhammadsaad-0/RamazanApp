package com.example.abc.ui.slideshow;

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
import com.example.abc.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {
    Activity table2;
    int index=0;
    private FragmentSlideshowBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        table2=getActivity();
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        return root;
    }
   public void onStart()
   {
       super.onStart();
       ImageView backimg =(ImageView) table2.findViewById(R.id.back);
       ImageView nextimg =(ImageView) table2.findViewById(R.id.next);
       TextView  ans =(TextView) table2.findViewById(R.id.anstxt1);
       String []  simple_name=getResources().getStringArray(R.array.ques2);
       ans.setText(simple_name[index]);

       backimg.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(index==0) {
                   Toast.makeText(getActivity().getApplicationContext(),"NO Previous:",Toast.LENGTH_SHORT).show();
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
                   Toast.makeText(getActivity().getApplicationContext(),"Name Ended:",Toast.LENGTH_SHORT).show();
               }
               else
               {
                   index++;
                   ans.setText(simple_name[index]);
               }
           }
       });

   };

   }


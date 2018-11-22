package com.example.rafael.mediminder;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {





    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).setActionBarTitle("Mediminder");
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button goToAct = view.findViewById(R.id.goToAct);
        goToAct.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Intent in = new Intent(getActivity(), ToDo.class);
                startActivity(in);
            }

        });

        return view;

    }



}



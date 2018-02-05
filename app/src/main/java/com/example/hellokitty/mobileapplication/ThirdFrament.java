package com.example.hellokitty.mobileapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/*
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ThirdFrament.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ThirdFrament#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ThirdFrament extends Fragment {
    public static ThirdFrament newInstance() {
        ThirdFrament fragment = new ThirdFrament();
        Bundle args = new Bundle();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_my_acc, container, false);
    }
}
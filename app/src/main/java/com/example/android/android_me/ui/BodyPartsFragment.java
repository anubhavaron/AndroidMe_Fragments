package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by ANUBHAV on 8/19/2017.
 */

public class BodyPartsFragment extends Fragment {

    public BodyPartsFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView=inflater.inflate(R.layout.fragment_bodt_parts,container,false);
        ImageView imageView=(ImageView)rootView.findViewById(R.id.bodypart_imageview);
        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));






        return rootView;
    }

}

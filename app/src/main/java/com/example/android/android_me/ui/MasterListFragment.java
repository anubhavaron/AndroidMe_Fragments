package com.example.android.android_me.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by ANUBHAV on 8/22/2017.
 */

public class MasterListFragment extends Fragment {
    OnImageClickListener mCallBack;
    public interface OnImageClickListener{

   void onItemSelected(int position);

    }
    public  MasterListFragment()
    {}
    @Override
    public void onAttach(Context context)
    {

        super.onAttach(context);

        try
        {
            mCallBack=(OnImageClickListener)context;

        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(context.toString()+"must implement listener");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.master_list_fragment, container, false);

        // Get a reference to the GridView in the fragment_master_list xml layout file
        GridView gridView = (GridView) rootView.findViewById(R.id.Grid_view_images);

        // Create the adapter
        // This adapter takes in the context and an ArrayList of ALL the image resources to display
        MasterListAdapter mAdapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());

        // Set the adapter on the GridView
        gridView.setAdapter(mAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               mCallBack.onItemSelected(position);
            }
        });

        // Return the root view
        return rootView;
    }
}

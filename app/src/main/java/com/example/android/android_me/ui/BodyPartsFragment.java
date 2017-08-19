package com.example.android.android_me.ui;

import android.nfc.Tag;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by ANUBHAV on 8/19/2017.
 */

public class BodyPartsFragment extends Fragment {
    private List<Integer> mImageId;


    public static final String IMAGE_TO_LIST="image_ids";
    public static final String List_Index="list_index";
    private int mImageIndex;
    private static final String TAG="Body Part Fragment";

    public BodyPartsFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        if(savedInstanceState!=null)
        {
            mImageId=savedInstanceState.getIntegerArrayList(IMAGE_TO_LIST);
            mImageIndex=savedInstanceState.getInt(List_Index);
        }

        View rootView=inflater.inflate(R.layout.fragment_bodt_parts,container,false);
        final ImageView imageView=(ImageView)rootView.findViewById(R.id.bodypart_imageview);
        if(mImageId!=null)
        {
            imageView.setImageResource(mImageId.get(mImageIndex));

        }
        else
        {
            Log.v(TAG,"Fragment IDS are NULL");
        }
        imageView.setOnClickListener(new  View.OnClickListener(){


            @Override
            public void onClick(View view)
            {
                if(mImageIndex<mImageId.size()-1)
                {
                    mImageIndex++;
                }
                else
                {
                    mImageIndex=0;
                }

                imageView.setImageResource(mImageId.get(mImageIndex));

            }



        });








        return rootView;
    }

    public void setImageId(List<Integer> ImageID)
    {
        mImageId=ImageID;
    }

    public void setindex(int index)
    {
        mImageIndex=index;
    }

    @Override
    public void onSaveInstanceState(Bundle currentState)
    {
        currentState.putIntegerArrayList(IMAGE_TO_LIST, (ArrayList<Integer>)mImageId);
        currentState.putInt(List_Index,mImageIndex);


    }

}

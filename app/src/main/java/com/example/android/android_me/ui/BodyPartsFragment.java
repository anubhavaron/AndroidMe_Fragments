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

import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by ANUBHAV on 8/19/2017.
 */

public class BodyPartsFragment extends Fragment {
    private List<Integer> mImageId;
    private int mImageIndex;
    private static final String TAG="Body Part Fragment";

    public BodyPartsFragment()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView=inflater.inflate(R.layout.fragment_bodt_parts,container,false);
        ImageView imageView=(ImageView)rootView.findViewById(R.id.bodypart_imageview);
        if(mImageId!=null)
        {
            imageView.setImageResource(mImageId.get(mImageIndex));

        }
        else
        {
            Log.v(TAG,"Fragment IDS are NULL");
        }






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

}

package com.example.android.android_me.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.android_me.R;

/**
 * Created by ANUBHAV on 8/22/2017.
 */

public class MainActivity extends AppCompatActivity implements MasterListFragment.OnImageClickListener {
    private int headindex,legindex,bodyindex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    @Override
    public void onItemSelected(int position) {
        Toast.makeText(this,"Position "+position,Toast.LENGTH_SHORT).show();
        int x=position/12;
        int y=position-(x)*12;
        switch (x)
        {

            case 0: headindex=y;
                    break;
            case 1: bodyindex=y;
                    break;
            case 2:legindex=y;
                break;
            default:break;
        }
        Bundle b=new Bundle();
        b.putInt("headindex",headindex);
        b.putInt("legindex",legindex);
        b.putInt("bodyindex",bodyindex);




        Button bu=(Button)findViewById(R.id.button);

        final Intent i=new Intent(this,AndroidMeActivity.class);
        i.putExtras(b);

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(i);
            }
        });




    }
}
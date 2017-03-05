package com.example.mdhvr.memegenerator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mdhvr on 9/11/2016.
 */
public class bottomfragment extends Fragment {

    TextView texttop;
    TextView textbottom;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottomfragment,container,false);

        texttop = (TextView) view.findViewById(R.id.toptextview);
        textbottom =(TextView) view.findViewById(R.id.bottomtextview);
        return view;
    }

    public void setMemetext(String top, String bottom){
        texttop.setText(top);
        textbottom.setText(bottom);
    }
}

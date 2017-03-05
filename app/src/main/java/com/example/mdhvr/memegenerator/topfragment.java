package com.example.mdhvr.memegenerator;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by mdhvr on 9/11/2016.
 */
public class topfragment extends android.support.v4.app.Fragment {

    TextView toptextfragment;
    TextView bottomtextfragment;
    Button b;

    topfragmentlistener activityCommander;
    public interface topfragmentlistener{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (topfragmentlistener)getActivity();
        }catch (ClassCastException e){
            throw new ClassCastException(getActivity().toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.topfragment,container,false);

        toptextfragment = (EditText) view.findViewById(R.id.toptext);
        bottomtextfragment= (EditText) view.findViewById(R.id.bottomtext);
        b = (Button) view.findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonclicked(v);
            }
        });
        return view;
    }

    public void buttonclicked(View view){
        activityCommander.createMeme(toptextfragment.getText().toString(),bottomtextfragment.getText().toString());

    }
}

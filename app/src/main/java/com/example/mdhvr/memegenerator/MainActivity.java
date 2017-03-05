package com.example.mdhvr.memegenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements topfragment.topfragmentlistener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom) {

        bottomfragment bottomf = (bottomfragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
        bottomf.setMemetext(top, bottom);

    }
}

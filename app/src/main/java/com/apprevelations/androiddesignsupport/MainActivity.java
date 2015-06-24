package com.apprevelations.androiddesignsupport;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    RelativeLayout parentLayout;
    Button show;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tool=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(tool);
        show=(Button) findViewById(R.id.show);
        text=(TextView)findViewById(R.id.text);
        parentLayout =(RelativeLayout)findViewById(R.id.parent);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Snackbar.make(parentLayout, "Snackbar with Action Button", Snackbar.LENGTH_LONG)
                        .setAction("ACTION", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                text.setVisibility(View.VISIBLE);

                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.action))
                        .setDuration(4000).show();
            }
        });
    }
}

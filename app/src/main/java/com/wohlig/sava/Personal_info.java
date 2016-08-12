package com.wohlig.sava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Mahesh on 8/12/2016.
 */
public class Personal_info extends AppCompatActivity {
    Toolbar toolbar;
    TextView toolbartitle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detail);
        toolbartitle = (TextView) findViewById(R.id.toolbar_title);
        toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbartitle.setText("Personal Info");
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.arrow_left5));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //What to do on back clicked
                finish();
            }
        });



      /*  DateEdit = (EditText) findViewById(R.id.date);
        DateEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePickerDialog(v);
            }
        });*/
    }
}

package com.wohlig.sava;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

/**
 * Created by adiam on 7/29/2016.
 */
public class MainPageActivity extends AppCompatActivity {
    RelativeLayout rl_im_new;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        rl_im_new= (RelativeLayout) findViewById(R.id.rl_im_new);
        rl_im_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(getApplicationContext(),SingUpActivity.class);
                startActivity(i);

            }
        });
    }
}

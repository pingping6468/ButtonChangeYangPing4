package com.example.administrator.buttonchangeyangping;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn10;
    private ImageButton btn11;
    private ImageButton btn12;
    private ImageButton btn13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn10 = (ImageButton)
                findViewById(R.id.imageButton10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn10.setImageResource(R.drawable.tab_item_home_normal);
                btn11.setImageResource(R.drawable.tab_item_category_focus);
                btn12.setImageResource(R.drawable.tab_item_cart_focus);
                btn13.setImageResource(R.drawable.tab_item_personal_focus);

            }


        });


        btn11 = (ImageButton)
                findViewById(R.id.imageButton11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn10.setImageResource(R.drawable.tab_item_home_focus);
                btn11.setImageResource(R.drawable.tab_item_category_normal);
                btn12.setImageResource(R.drawable.tab_item_cart_focus);
                btn13.setImageResource(R.drawable.tab_item_personal_focus);

            }


        });

        btn12 = (ImageButton)
                findViewById(R.id.imageButton12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn10.setImageResource(R.drawable.tab_item_home_focus);
                btn11.setImageResource(R.drawable.tab_item_category_focus);
                btn12.setImageResource(R.drawable.tab_item_cart_normal);
                btn13.setImageResource(R.drawable.tab_item_personal_focus);

            }


        });

        btn13 = (ImageButton)
                findViewById(R.id.imageButton13);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn10.setImageResource(R.drawable.tab_item_home_focus);
                btn11.setImageResource(R.drawable.tab_item_category_focus);
                btn12.setImageResource(R.drawable.tab_item_cart_focus);
                btn13.setImageResource(R.drawable.tab_item_personal_normal);

            }


        });


    }
}
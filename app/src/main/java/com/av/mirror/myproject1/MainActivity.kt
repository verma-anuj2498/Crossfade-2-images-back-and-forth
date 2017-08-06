package com.av.mirror.myproject1

import android.annotation.TargetApi
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity(){


    
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            var x = 0;
            setContentView(R.layout.activity_main);

            imageView.setOnClickListener {
            imageView.animate().alpha(0f);
                if (x == 0) {
                    imageView.setImageResource(R.drawable.barttwo)
                    x = 1
                } else {
                    imageView.setImageResource(R.drawable.bartone)
                    x = 0
                }

                imageView.animate().alpha(1f).setDuration(2000);



            }


        }

}
package com.example.sahid.coinflip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button flip;
    private ImageView image;
    Random r;
    int take;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flip=findViewById(R.id.flip);
        image=findViewById(R.id.image);

        r=new Random();
        flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                take=r.nextInt(2);

                if(take==0)
                {
                    image.setImageResource(R.drawable.pound);
                }
                if(take==1)
                {
                    image.setImageResource(R.drawable.pound2);
                }
                Log.d(String.valueOf(take),"sahid");

                RotateAnimation rotation=new RotateAnimation(0,360,RotateAnimation.RELATIVE_TO_SELF,0.50f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
                rotation.setDuration(4000);
                image.setAnimation(rotation);
            }
        });

    }
}

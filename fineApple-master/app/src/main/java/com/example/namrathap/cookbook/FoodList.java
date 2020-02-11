package com.example.namrathap.cookbook;

import android.app.ActionBar;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import java.util.*;
//import com.cloudinary.Cloudinary;
import java.lang.*;
import java.net.*;
import android.media.*;
import java.io.IOException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class FoodList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        double result = b.getDouble("bmi");
        //Cloudinary cloudinary = new Cloudinary();
        Image image = null;
        ImageView imageView = findViewById(R.id.imageView);

        if(result <= 18){
            Resources r = getResources();
            Drawable drawable = r.getDrawable(R.drawable.cereal);
            imageView.setImageDrawable(drawable);

        }
        else if(result > 18 && result <= 24){
            Resources r = getResources();
            Drawable drawable = r.getDrawable(R.drawable.dessert);
            imageView.setImageDrawable(drawable);
        }
        else{
            // URL url = new URL("https://res.cloudinary.com/dxbn3kz68/image/upload/w_220,h_140,c_fill/l_fruits,w_220,h_140,c_fill,x_220/l_eggsandbeans,w_220,h_140,c_fill,y_140,x_-110/l_oatmeal,w_220,h_140,c_fill,y_70,x_110/leanmeat.jpg");
            // Image image = ImageIO.read(url);
            //URL url = new URL("https://res.cloudinary.com/dxbn3kz68/image/upload/w_220,h_140,c_fill/l_fruits,w_220,h_140,c_fill,x_220/l_eggsandbeans,w_220,h_140,c_fill,y_140,x_-110/l_oatmeal,w_220,h_140,c_fill,y_70,x_110/leanmeat.jpg");

            //Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
            //imageView.setImageBitmap(bmp);
            //imageView.setLayoutParams(new LinearLayout.LayoutPara
            Resources r = getResources();
            Drawable drawable = r.getDrawable(R.drawable.leanmeat);
            imageView.setImageDrawable(drawable);
            //Glide.with(this).load("https://res.cloudinary.com/dxbn3kz68/image/upload/w_220,h_140,c_fill/l_fruits,w_220,h_140,c_fill,x_220/l_eggsandbeans,w_220,h_140,c_fill,y_140,x_-110/l_oatmeal,w_220,h_140,c_fill,y_70,x_110/leanmeat.jpg").into(imageView);
            //Picasso.get().load("https://inthecheesefactory.com/uploads/source/glidepicasso/quality2.jpg").into(imageView);

        }
    }
}

package com.example.dell.vm.ui;

import android.app.Application;
import android.graphics.Bitmap;

import com.squareup.picasso.Picasso;

/**
 * Created by dell on 2017/4/5.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initPicasso();

    }

    private void initPicasso() {
        Picasso picasso = new Picasso.Builder(this)
                .defaultBitmapConfig(Bitmap.Config.RGB_565)
                .build();
        Picasso.setSingletonInstance(picasso);
    }
}

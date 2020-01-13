package com.wong.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wong.view.utils.FormatUtils;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomTextView mCTV = findViewById(R.id.ctv_up);
        mCTV.setCustomText("hello world!");
        PictureView pictureView = findViewById(R.id.pv);
        Drawable drawable = getResources().getDrawable(R.mipmap.ic_launcher1,null);
        pictureView.setBitmap(FormatUtils.drawable2Bitmap(drawable));

    }
}


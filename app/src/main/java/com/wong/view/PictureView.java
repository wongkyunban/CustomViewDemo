package com.wong.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class PictureView extends View {
    private Bitmap bitmap;
    private Paint mPaint = new Paint();

    public PictureView(Context context) {
        super(context);
    }

    public PictureView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(bitmap != null){
            int height = getHeight();
            int width = getWidth();

            canvas.drawBitmap(bitmap,0,0,mPaint);
        }

    }
    public void setBitmap(Bitmap bitmap){
        this.bitmap = bitmap;
    }
}

package com.wong.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomCircleView extends View {
    /*半径*/
    private int radius = 10;
    /*边的颜色*/
    private int strokeColor = Color.BLACK;
    /*边的宽度*/
    private float strokeWidth = 1;
    /*填充颜色*/
    private int fillColor = Color.WHITE;
    /*文本*/
    private String text;
    /*文本大小*/
    private int textSize = 16;
    /*文本的颜色*/
    private int textColor = Color.BLACK;
    public CustomCircleView(Context context) {
        super(context);
        init(context);
    }

    public CustomCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        /**
         * 加载自定义属性集合CircleView
         * 要在styles.xml中添加配置：
         *    <declare-styleable name="CustomCircleView">
         *         <!-- 半径 -->
         *         <attr name="radius" format="integer"/>
         *         <!-- 边的颜色 -->
         *         <attr name="stroke_color" format="color"/>
         *         <!-- 边的宽度 -->
         *         <attr name="stroke_width" format="dimension"/>
         *         <!-- 填充的颜色 -->
         *         <attr name="fill_color" format="color"/>
         *         <!-- 文本 -->
         *         <attr name="text" format="string"/>
         *         <!-- 文本大小 -->
         *         <attr name="text_size" format="integer"/>
         *         <!-- 文本的颜色 -->
         *         <attr name="text_color" format="color"/>
         *     </declare-styleable>
         *
         */
       TypedArray typedArray = context.obtainStyledAttributes(R.styleable.CustomCircleView);

        radius = typedArray.getInt(R.styleable.CustomCircleView_radius,radius);
        strokeColor = typedArray.getColor(R.styleable.CustomCircleView_stroke_color, strokeColor);
        strokeWidth = typedArray.getDimension(R.styleable.CustomCircleView_stroke_width,strokeWidth);
        fillColor = typedArray.getColor(R.styleable.CustomCircleView_fill_color,fillColor);
        text = typedArray.getString(R.styleable.CustomCircleView_text);
        textSize = typedArray.getInteger(R.styleable.CustomCircleView_text_size,textSize);
        textColor = typedArray.getColor(R.styleable.CustomCircleView_text_color,textColor);
       typedArray.recycle();
    }

    /**
     * 1)  {@link Canvas#save()}：把当前绘制的图像保存起来，让后续的操作相当于是在一个新图层上绘制；
     * 2)  {@link Canvas#restore()}：把当前画布调整到上一个save()之前的状态；
     * 3)  {@link Canvas#translate(float, float)}：把当前画布的原点移到(dx, dy)点，后续操作都以(dx, dy)点作为参照；
     * 4)  {@link Canvas#scale(float, float)}：将当前画布在水平方向上缩放x倍，竖直方向上缩放y倍；
     * 5)  {@link Canvas#rotate(float)}：将当前画布顺时针旋转angle度.
     *
     * 6)  {@link Canvas#drawArc(RectF, float, float, boolean, Paint)}：绘制圆弧；
     * 7)  {@link Canvas#drawBitmap(Bitmap, Matrix, Paint)}：绘制Bitmap图像；
     * 8)  {@link Canvas#drawCircle(float, float, float, Paint)}：绘制圆圈；
     * 9)  {@link Canvas#drawLine(float, float, float, float, Paint)}：绘制线条；
     * 10) {@link Canvas#drawOval(RectF, Paint)}：绘制椭圆；
     * 11) {@link Canvas#drawPath(Path, Paint)}：绘制Path路径；
     * 12) {@link Canvas#drawPicture(Picture)}：绘制Picture图片；
     * 13) {@link Canvas#drawRect(Rect, Paint)}：绘制矩形；
     * 14) {@link Canvas#drawRoundRect(RectF, float, float, Paint)}：绘制圆角矩形；
     * 15) {@link Canvas#drawText(String, float, float, Paint)}：绘制文本；
     * 16) {@link Canvas#drawVertices(Canvas.VertexMode, int, float[], int, float[], int, int[], int, short[], int, int, Paint)}：绘制顶点。
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 获取控件的高度和宽度
        int width = getWidth();
        int height = getHeight();

        // 设置圆的半径 = 宽,高最小值的2分之1
        int r = Math.min(width, height);
        r = Math.min(r/2,radius);

        // 画出圆（蓝色）
        // 圆心 = 控件的中央,半径 = 宽,高最小值的2分之1
        //canvas.drawCircle(width/2,height/2,r,mPaint1);
    }
}


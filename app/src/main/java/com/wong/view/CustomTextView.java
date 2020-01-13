package com.wong.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

/**
 * 继承特定View
 * 扩展已有View的功能(如：{@link android.widget.TextView})
 * 方法：在原有基础上扩展功能
 */
public class CustomTextView extends AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /*自动将小写字母转换成大写字母*/
    public void setCustomText(String text) {
        if(!TextUtils.isEmpty(text)){
            this.setText(text.toUpperCase());
        }
    }
}

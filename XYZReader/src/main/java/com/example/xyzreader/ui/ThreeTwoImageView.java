package com.example.xyzreader.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by neha on 4/9/17.
 */

public class ThreeTwoImageView extends ImageView {


    public ThreeTwoImageView(Context context) {
        super(context);
    }

    public ThreeTwoImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeTwoImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override

    protected void onMeasure(int wSpec,int hSpec){

        int height = MeasureSpec.getSize(wSpec) * 2 / 3;

        int heightSpec = MeasureSpec.makeMeasureSpec(height,MeasureSpec.EXACTLY);

        super.onMeasure(wSpec,heightSpec);
    }


}

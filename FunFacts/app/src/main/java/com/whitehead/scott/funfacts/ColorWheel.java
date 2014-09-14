package com.whitehead.scott.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by scott on 9/12/2014.
 */
public class ColorWheel {
    public int getColor() {
        String mColor = "";

        String[] mColors = {
                "#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7d669e", // purple
                "#53bbb4", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#637a91", // dark gray
                "#f092b0", // pink
                "#b7c0c7"  // light gray
        };

        Random randomGenerater = new Random();
        int randomNumber = randomGenerater.nextInt(mColors.length);

        mColor = mColors[randomNumber];

        int intColor = Color.parseColor(mColor);

        return intColor;

    }

}
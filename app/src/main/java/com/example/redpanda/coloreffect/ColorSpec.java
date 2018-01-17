package com.example.redpanda.coloreffect;

import android.content.Context;

import java.util.StringTokenizer;

/**
 * Created by redpanda on 17.01.18.
 */

public class ColorSpec {
    static String getEffect(Context context, int position) {
        String[] strings = context.getResources().getStringArray(R.array.effect);
        String effect = strings[position];
        return effect;
    }
}

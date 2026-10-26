package com.kore.ai.widgetsdk.application;

import android.content.Context;

import com.kore.ai.widgetsdk.utils.DimensionUtil;

/**
 * Copyright (c) 2014 Kore Inc. All rights reserved.
 */
public class AppControl {

    private Context context;
    private static AppControl singleton;
    private DimensionUtil dimensionUtil;

    public AppControl(Context context) {
        this.context = context;
        singleton = this;

        dimensionUtil = new DimensionUtil(context);
    }

    public static AppControl getInstance() {
        return singleton;
    }
    public static AppControl getInstance(Context mContext) {
        if(singleton == null){
            singleton = new AppControl(mContext);
        }
        return singleton;
    }

    public DimensionUtil getDimensionUtil() {
        return dimensionUtil;
    }
}

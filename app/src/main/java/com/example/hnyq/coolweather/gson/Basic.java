package com.example.hnyq.coolweather.gson;

import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;



/**
 * Created by hnyq on 2017/3/11.
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}

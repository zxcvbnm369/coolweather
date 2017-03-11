package com.example.hnyq.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hnyq on 2017/3/10.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWsh carWsh;

    public Sport sport;

    private class Comfort {
        @SerializedName("txt")
        public String info;
    }

    private class CarWsh {
        @SerializedName("txt")
        public String info;
    }

    private class Sport {
        @SerializedName("txt")
        public String info;
    }
}

package com.example.hnyq.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hnyq on 2017/3/7.
 */

public class County extends DataSupport {
    private int id;
    private String CountyName;//县的名字
    private int weatherId;//县所对应的天气
    private int cityId;//县所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }


}

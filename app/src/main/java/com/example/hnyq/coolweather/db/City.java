package com.example.hnyq.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by hnyq on 2017/3/7.
 */

public class City extends DataSupport {
    private int id;
    private String CityName;//记录市名
    private int cityCode;//记录市代号
    private int provinceId;//记录当前市所属省的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

}

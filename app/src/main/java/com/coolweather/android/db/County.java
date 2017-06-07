package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by chenxiaokang on 2017/6/7.
 */

public class County extends DataSupport {

    private String countyName;

    private String weatherId;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}

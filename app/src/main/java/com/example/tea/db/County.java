package com.example.tea.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatheId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatheId() {
        return weatheId;
    }

    public void setWeatheId(String weatheId) {
        this.weatheId = weatheId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

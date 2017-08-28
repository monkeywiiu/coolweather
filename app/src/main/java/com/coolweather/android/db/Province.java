package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/27 0027.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceCode(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvincecode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode = provinceCode;
    }
}

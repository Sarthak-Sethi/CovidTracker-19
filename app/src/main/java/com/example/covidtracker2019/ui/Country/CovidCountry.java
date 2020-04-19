package com.example.covidtracker2019.ui.Country;

public class CovidCountry {
    String mcovidcountry,mcases,mtodaycases,mdeaths,mtodaydeaths,mrecovered,mcritical;

    public CovidCountry(String mcovidcountry, String mcases) {
        this.mcovidcountry = mcovidcountry;
        this.mcases = mcases;
        this.mtodaycases = mtodaycases;
        this.mdeaths = mdeaths;
        this.mtodaydeaths = mtodaydeaths;
        this.mrecovered = mrecovered;
        this.mcritical = mcritical;
    }

    public CovidCountry() {
    }

    public String getMcovidcountry() {
        return mcovidcountry;
    }

    public void setMcovidcountry(String mcovidcountry) {
        this.mcovidcountry = mcovidcountry;
    }

    public String getMcases() {
        return mcases;
    }

    public void setMcases(String mcases) {
        this.mcases = mcases;
    }

    public String getMtodaycases() {
        return mtodaycases;
    }

    public void setMtodaycases(String mtodaycases) {
        this.mtodaycases = mtodaycases;
    }

    public String getMdeaths() {
        return mdeaths;
    }

    public void setMdeaths(String mdeaths) {
        this.mdeaths = mdeaths;
    }

    public String getMtodaydeaths() {
        return mtodaydeaths;
    }

    public void setMtodaydeaths(String mtodaydeaths) {
        this.mtodaydeaths = mtodaydeaths;
    }

    public String getMrecovered() {
        return mrecovered;
    }

    public void setMrecovered(String mrecovered) {
        this.mrecovered = mrecovered;
    }

    public String getMcritical() {
        return mcritical;
    }

    public void setMcritical(String mcritical) {
        this.mcritical = mcritical;
    }
}

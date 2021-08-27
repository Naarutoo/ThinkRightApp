package com.example.thinkright;

public class MasterModel {
    int masterImage;
    String masterHeader, masterDesc;

    public MasterModel(int masterImage, String masterHeader, String masterDesc) {
        this.masterImage = masterImage;
        this.masterHeader = masterHeader;
        this.masterDesc = masterDesc;
    }

    public int getMasterImage() {
        return masterImage;
    }

    public String getMasterHeader() {
        return masterHeader;
    }

    public String getMasterDesc() {
        return masterDesc;
    }
}

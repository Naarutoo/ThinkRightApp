package com.example.thinkright;

public class MeditationModel {
    int typeImage;
    String typeText;

    public MeditationModel(int typeImage, String typeText) {
        this.typeImage = typeImage;
        this.typeText = typeText;
    }

    public int getTypeImage() {
        return typeImage;
    }

    public String getTypeText() {
        return typeText;
    }
}

package com.example.multirecyclerview.Models;

public class FruitsModels {

    int picFruits;
    String textFruits;
//    creates constructor
    public FruitsModels(int picFruits, String textFruits){
        this.picFruits = picFruits;
        this.textFruits = textFruits;
    }
//    creates getter and setter
//    image
    public int getPicFruits(){
        return picFruits;
    }
    public void setPicFruits(int picFruits){
        this.picFruits = picFruits;
    }
//    text
    public String getTextFruits(){
        return textFruits;
    }
    public void setTextFruits(String textFruits){
        this.textFruits = textFruits;
    }
}

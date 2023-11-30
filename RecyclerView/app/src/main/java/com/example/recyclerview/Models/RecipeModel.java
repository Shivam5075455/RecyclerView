package com.example.recyclerview.Models;

public class RecipeModel {
    int pic;
    String text;

//    creates constructor
    public RecipeModel(int pic, String text){
        this.pic = pic;
        this.text = text;
    }

//    creates getter and setter. These getter and setter are used in Adapter class to get and set the content
//    Image
    public int getPic(){
        return pic;
    }
    public void setPic(int pic){
        this.pic = pic;
    }
//    Text
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
}

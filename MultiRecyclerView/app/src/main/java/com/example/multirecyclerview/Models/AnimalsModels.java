package com.example.multirecyclerview.Models;

public class AnimalsModels {

    int pic;
    String text;

//    creates constructor
    public AnimalsModels(int pic, String text){
        this.pic = pic;
        this.text = text;
    }

//    implements getter and setter
//    pic
    public int getPic(){
        return pic;
    }
    public void setPic(int pic){
        this.pic = pic;
    }
//    text
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

}

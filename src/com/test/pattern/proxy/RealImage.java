package com.test.pattern.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void displayImg(){
        System.out.println("display image - "+fileName);
    }

    public void loadFromDisk(String fileName){
        System.out.println("load from disk : "+fileName);
    }
}
package com.example.pattern.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void displayImg(){
        if(realImage == null){
            realImage = new RealImage(this.fileName);
        }
        realImage.displayImg();
    }
}
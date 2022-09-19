package com.jf;

public class CarFactory {

    public static BMW bmw = new BMW();

    private CarFactory(){}

    public static BMW createBMW(){
        bmw.setName("test");
        return bmw;
    }
}

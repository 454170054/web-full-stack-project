package com.jf;

public class CarFactory {

    public static BMW bmw = new BMW();

    private CarFactory(){}

    public BMW createBMW(){
        return bmw;
    }
}

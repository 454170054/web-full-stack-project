package com.jf;

public class CarFactory {

    public static BMW bmw = new BMW();

    public BMW createBMW(){
        return bmw;
    }
}

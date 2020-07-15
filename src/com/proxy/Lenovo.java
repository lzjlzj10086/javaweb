package com.proxy;

public class Lenovo implements sale{
    @Override
    public String saleComputer(int money){
        System.out.println("买了一台"+money+"块电脑");
        return "lenovo电脑";
    }

    @Override
    public void show() {
        System.out.println("show.......");
    }
}

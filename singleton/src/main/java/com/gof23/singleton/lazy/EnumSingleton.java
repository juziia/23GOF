package com.gof23.singleton.lazy;

public enum EnumSingleton {
    INSTANCE;


    public EnumSingleton getInstance(){
        return INSTANCE;
    }


}

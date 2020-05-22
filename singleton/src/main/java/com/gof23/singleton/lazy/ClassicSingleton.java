package com.gof23.singleton.lazy;

/**
 *  懒汉式单例模式
 */
public class ClassicSingleton {

    private static ClassicSingleton classicSingleton = null;

    // 单例设计模式特点:   构造方法私有化   提供一个全局访问实例对象方法

    private ClassicSingleton(){}



    public static ClassicSingleton getInstance(){

        //  此处有线程安全问题
        if(classicSingleton == null){
            classicSingleton = new ClassicSingleton();
        }
        return classicSingleton;
    }

}

package com.gof23.singleton.lazy;

/**
 *  使用静态内部类实现懒汉式单例:
 *     其原理是采用了jvm加载类的机制,只有当类被使用的时候才会被加载从而达到延迟加载的目的
 */
public class InnerClassSingleton {



    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){

        return staticInnerClass.innerClassSingleton;
    }


    private static class staticInnerClass{
        private static final InnerClassSingleton innerClassSingleton = new InnerClassSingleton() ;

    }


}

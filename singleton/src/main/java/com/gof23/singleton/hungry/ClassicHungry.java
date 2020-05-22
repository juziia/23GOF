package com.gof23.singleton.hungry;

/**
 *  饿汉式单例:
 *    饿汉式单例即:  已经将对象实例化完成,需要的时候直接获取就行,不需要创建,饿汉式单例不会有线程安全问题,但是会导致资源的浪费
 *                  因为,即使单例对象没有被使用,但是依然被实例化了
 */
public class ClassicHungry {

    private static final ClassicHungry classicHungry = new ClassicHungry();

    // 单例模式特点:  构造方式私有化
    private ClassicHungry(){

    }


    public static ClassicHungry getInstance(){
        return classicHungry;
    }

}

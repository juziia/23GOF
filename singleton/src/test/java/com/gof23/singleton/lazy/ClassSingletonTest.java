package com.gof23.singleton.lazy;

import com.gof23.singleton.hungry.ClassicHungry;

public class ClassSingletonTest {

    public static void main(String[] args) {
       /* final ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
        ClassicSingleton classicSingleton2 = ClassicSingleton.getInstance();

        System.out.println(classicSingleton == classicSingleton2);*/

        Runnable runnable = new Runnable() {
            public void run() {
                ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+":"+classicSingleton);
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        // 懒汉式单例有线程安全问题
        //Thread-0:com.gof23.singleton.lazy.ClassicSingleton@1d2f73d0
        //Thread-1:com.gof23.singleton.lazy.ClassicSingleton@e2980e8

    }
}

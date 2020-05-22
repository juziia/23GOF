package com.gof23.singleton.lazy;

public class SynchronizeLazySingletonTest {


    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                SynchronizeLazySingleton synchronizeLazySingleton = SynchronizeLazySingleton.getInstance();
                System.out.println(Thread.currentThread().getName()+":"+synchronizeLazySingleton);
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();

    }
}

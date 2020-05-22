package com.gof23.singleton.lazy;

/**
 *  为了保持懒汉式单例的线程安全问题,使用synchronized关键字保证线程的安全
 */
public class SynchronizeLazySingleton {

    private static SynchronizeLazySingleton synchronizeLazySingleton = null;

    private SynchronizeLazySingleton(){

    }


    /**
     *  虽然jdk1.6对synchronized优化了,但是使用synchronized关键字修饰方法,将会锁住整个类,因为此方法由static修饰
     *  所以并不推荐使用此方式来保证线程安全,建议采用双重检查来保证线程安全
     * @return
     */
    public static synchronized SynchronizeLazySingleton getInstance(){

        if(synchronizeLazySingleton == null){
            synchronizeLazySingleton = new SynchronizeLazySingleton();
        }

        return synchronizeLazySingleton;
    }


}

package com.gof23.singleton.lazy;

/**
 * 双重检查机制解决懒汉式单例模式的线程安全问题
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton doubleCheckSingleton = null;


    private DoubleCheckSingleton(){
        if(doubleCheckSingleton != null){
            throw new RuntimeException("不能够重复创建对象");
        }
    }


    /**
     *   双重检查机制:
     *          在最外层使用if先判断实例是否为空,再在内部使用synchronize同步代码块来确保线程安全,
     *          再到内部再判断一次实例是否为空,确保实例不会创建第二次
     */
    public static DoubleCheckSingleton getInstance(){
        // 此处判断主要用于确保每次获取对象时不需要走同步代码块
        if(doubleCheckSingleton == null){
            // 为什么锁住对象? 我觉得是因为此方法被static修饰,归属于类,所有要锁住此类的class对象
            synchronized (DoubleCheckSingleton.class){
                // 此处判断是为了当实例未被创建时,当多个线程同时调用此方法获取实例对象,发生多个线程并发访问了此方法
                //在第一层判断时,如果多个线程判断实例都为空,则会进入同步代码块,每个线程都需要后取锁才能执行同步代码块中的代码
                // 当第一个线程进来时,会实例化对象,然后释放锁,后面的线程也会执行同样的步骤
                // 但在同步代码块中再加入一个判断,判断实例是否为null,便可以完美的规避此问题,达到单例的要求
                if(doubleCheckSingleton == null){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        /** 总结的讲:
         *      第一个if是为了避免每次调用获取实例的方法都需要执行同步代码块中的代码
         *      加synchronized修饰同步代码块,达到线程安全的目的
         *      第二个if是则是为了达到单例的目的
         *
         *  使用双重检查机制可以在保证线程安全的同时大大提高了获取实例的效率
         *
         */
        return  doubleCheckSingleton;

    }


    public Object readResolve(){
        return  this.getInstance();
    }

}

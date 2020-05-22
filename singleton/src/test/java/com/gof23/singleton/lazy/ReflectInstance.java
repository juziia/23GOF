package com.gof23.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *  通过反射破坏单例模式
 */
public class ReflectInstance {

    public static void main(String[] args) {
//        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();

        try {
            Constructor<DoubleCheckSingleton> constructor = DoubleCheckSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            DoubleCheckSingleton instance1 = constructor.newInstance();
            DoubleCheckSingleton instance2 = constructor.newInstance();

            System.out.println(instance1);
            System.out.println(instance2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

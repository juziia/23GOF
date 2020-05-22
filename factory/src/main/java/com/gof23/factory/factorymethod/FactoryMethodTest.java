package com.gof23.factory.factorymethod;


/**
 *  工厂方法就是在工厂类提供获取各个产品类对象的方法 ,与简单工厂相比,不用过多的判断,需要那个对象就调用那个方法,
 *  内部已经封装好了细节
 *
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse javaCourse = courseFactory.javaCourse();
        ICourse pythonCourse = courseFactory.pythonCourse();

        javaCourse.record();
        pythonCourse.record();
    }
}

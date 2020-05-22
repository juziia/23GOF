package com.gof23.factory.abstarctfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractCourseFactory abstractCourseFactory = new JavaCourseFactory();

        abstractCourseFactory.createCourse().record();

        abstractCourseFactory.createNote().note();

        abstractCourseFactory.createVideo().video();
    }
}

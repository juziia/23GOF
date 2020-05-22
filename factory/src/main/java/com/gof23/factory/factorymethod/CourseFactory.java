package com.gof23.factory.factorymethod;

public class CourseFactory {

    public ICourse javaCourse(){
        return new JavaCourse();
    }


    public ICourse pythonCourse(){
        return new PythonCourse();
    }


}

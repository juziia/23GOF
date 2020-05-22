package com.gof23.factory.simplefactory;

public class CourseFactroyTest {

    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
//        ICourse course = courseFactory.create("java");
//       根据传入的全类名反射创建对象
//        ICourse course = courseFactory.create("com.gof23.factory.simplefactory.JavaCourse");
        // 根据传入的ICourse的实现类的字节码对象反射创建对象
        ICourse course = courseFactory.create(JavaCourse.class);
        course.record();
    }
}

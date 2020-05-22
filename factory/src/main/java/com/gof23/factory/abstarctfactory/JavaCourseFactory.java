package com.gof23.factory.abstarctfactory;

public class JavaCourseFactory implements AbstractCourseFactory {
    public ICourse createCourse() {
        return new JavaCourse();
    }

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        return new JavaVideo();
    }
}

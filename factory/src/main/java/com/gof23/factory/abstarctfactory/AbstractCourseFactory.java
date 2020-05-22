package com.gof23.factory.abstarctfactory;

public interface AbstractCourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();

}

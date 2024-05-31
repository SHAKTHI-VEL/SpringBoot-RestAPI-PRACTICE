package com.studapi.studapi.services;

import com.studapi.studapi.entities.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();
    public Course getCourse(long CourseId);

}

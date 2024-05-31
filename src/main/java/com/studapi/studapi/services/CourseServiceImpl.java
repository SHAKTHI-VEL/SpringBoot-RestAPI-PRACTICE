package com.studapi.studapi.services;

import com.studapi.studapi.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        super();
        list = new ArrayList<>();
        list.add(new Course(1, "Java Programming", "Java Programming"));
        list.add(new Course(2, "Python", "Python"));
        list.add(new Course(3, "C#", "C#"));
        list.add(new Course(4, "C++", "C++"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long CourseId) {
        Course c=null;
        for (Course course: list) {
            if(course.getId()==CourseId){
                c=course;
                break;
            }
        }
        return c;
    }
}

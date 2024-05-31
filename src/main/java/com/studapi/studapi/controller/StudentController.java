package com.studapi.studapi.controller;

import com.studapi.studapi.entities.Course;
import com.studapi.studapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home(){
       return "this is home";
    }

    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

}

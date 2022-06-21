package com.lab.phase1.repo;

import com.lab.phase1.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {
    private static List<Course> courses = new ArrayList<>();

    public CourseRepo() {
        Course c1 = new Course(1,"WAA", "CS545");
        Course c2 = new Course(2,"WAP","CS472");
        courses.add(c1);
        courses.add(c2);
    }

    public List<Course> findAll(){
        return courses;
    }

    public void create(Course c){
        courses.add(c);
    }

    public void deleteById(int id) {
        courses.remove(id-1);
    }

    public void update(Course c) {
//        courses.
    }
}

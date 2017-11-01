package com.netcracker.zagursky.dao;


import com.netcracker.zagursky.entity.Course;

import java.util.List;

public interface CourseDao {
    List<Course> getCourses();

    Course getCourseById(int id);

    void addCourse(Course course);

    void update(Course course);

    void delete(int id);
}

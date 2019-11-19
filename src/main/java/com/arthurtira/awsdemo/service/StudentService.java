package com.arthurtira.awsdemo.service;

import com.arthurtira.awsdemo.model.Student;

import java.util.List;

/**
 * @author Arthur Tira on 11/19/2019
 * @project aws-demo
 */
public interface StudentService {
    Student getStudentByRegId(String studentId);
    List<Student> getAllStudents();
    Student createStudentRecord(Student student);


}

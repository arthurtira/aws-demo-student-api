package com.arthurtira.awsdemo.service.impl;

import com.arthurtira.awsdemo.exceptions.DuplicateStudentException;
import com.arthurtira.awsdemo.model.Student;
import com.arthurtira.awsdemo.repo.StudentRepository;
import com.arthurtira.awsdemo.service.StudentService;
import com.arthurtira.awsdemo.utils.StudentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Arthur Tira on 11/19/2019
 * @project aws-demo
 */
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository repository){
        this.studentRepository = repository;
    }

    @Override
    public Student getStudentByRegId(String studentId) {
        if(studentId == null) {
            return  null;
        }
        Optional<Student> optionalStudent = studentRepository.findStudentByStudentRegId(studentId);
        return optionalStudent.orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudentRecord(Student student) {
        Optional<Student> optionalStudent = studentRepository.findStudentByEmail(student.getEmail());

        Student existing = optionalStudent.orElse(null);
        if(existing != null){
            throw new DuplicateStudentException("Student with email: " + existing.getEmail() + " already exists!");
        }

        student.setStudentRegId(StudentUtils.reg_gen(student));

        return studentRepository.save(student);
    }
}

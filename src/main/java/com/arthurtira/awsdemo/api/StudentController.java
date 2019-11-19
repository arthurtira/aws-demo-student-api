package com.arthurtira.awsdemo.api;

import com.arthurtira.awsdemo.model.Student;
import com.arthurtira.awsdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Arthur Tira on 11/19/2019
 * @project aws-demo
 */
@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping(path = "/{studentRegId}")
    public ResponseEntity<Student> getStudentByRegId(@PathVariable String studentRegId){
        return new ResponseEntity<>(studentService.getStudentByRegId(studentRegId), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllStudents() {
        return  new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping(path = "/student")
    public ResponseEntity<Student> createStudentRecord(@RequestBody Student student){
        return  new ResponseEntity<>(studentService.createStudentRecord(student), HttpStatus.CREATED);
    }


}

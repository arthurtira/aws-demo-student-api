package com.arthurtira.awsdemo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

/**
 * @author Arthur Tira on 11/19/2019
 * @project aws-demo
 */
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "student_reg_id")
    private String studentRegId;
    private String email;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private byte age;
    private String course;


}

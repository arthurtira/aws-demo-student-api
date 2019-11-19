package com.arthurtira.awsdemo.utils;

import com.arthurtira.awsdemo.model.Student;

import java.util.Random;

/**
 * @author Arthur Tira on 11/19/2019
 * @project aws-demo
 */
public class StudentUtils {
    public static String reg_gen(Student student){
        String firstLetterOfFirstName = student.getFirstName().substring(0,1).toUpperCase();
        String firstLetterOfLastName = student.getLastName().substring(0, 1).toUpperCase();

        Random r = new Random( System.currentTimeMillis() );
        int randomNumber =  ((1 + r.nextInt(2)) * 100000 + r.nextInt(100000));

        String studentId = firstLetterOfFirstName + randomNumber + firstLetterOfLastName;

        return  studentId;
    }
}

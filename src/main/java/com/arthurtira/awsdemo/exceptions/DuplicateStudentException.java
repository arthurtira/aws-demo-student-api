package com.arthurtira.awsdemo.exceptions;

/**
 * @author Arthur Tira on 11/19/2019
 * @project aws-demo
 */
public class DuplicateStudentException extends RuntimeException {
    public DuplicateStudentException(String s) {
        super(s);
    }
}

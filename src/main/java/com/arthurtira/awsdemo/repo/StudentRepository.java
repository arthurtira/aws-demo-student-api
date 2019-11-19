package com.arthurtira.awsdemo.repo;

import com.arthurtira.awsdemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Arthur Tira on 11/19/2019
 * @project aws-demo
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
     Optional<Student> findStudentByStudentRegId(String studentRegId);
     Optional<Student> findStudentByEmail(String email);
}

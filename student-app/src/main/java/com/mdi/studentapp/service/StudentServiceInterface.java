package com.mdi.studentapp.service;

import com.mdi.studentapp.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentServiceInterface {
    String addStudent(String firstName, String lastName, String email, String course);
    List<Student> findAllStudents();
    Optional<Student> findStudentById(Integer id);
}

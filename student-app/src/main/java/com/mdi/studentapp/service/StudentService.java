package com.mdi.studentapp.service;

import com.mdi.studentapp.entity.Student;
import com.mdi.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentServiceInterface {

    @Autowired
    private StudentRepository studentRepository;


    @Override
    public String addStudent(String firstName, String lastName, String email, String course) {
        Student studentEntity = new Student();
        studentEntity.setFirstName(firstName);
        studentEntity.setLastName(lastName);
        studentEntity.setEmail(email);
        studentEntity.setCourse(course);
        studentRepository.save(studentEntity);
        return "New student added!";
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findStudentById(Integer id) {
        return studentRepository.findById(id);
    }

}

package com.mdi.studentapp.controller;

import com.mdi.studentapp.entity.Student;
import com.mdi.studentapp.repository.StudentRepository;
import com.mdi.studentapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    public StudentController(StudentRepository studentRepository) {
        this.studentService = studentService;
    }

    @PostMapping(path = "/addStudent")
    public String addStudent(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email, @RequestParam String course) {
        return studentService.addStudent(firstName, lastName, email, course);
    }

    @GetMapping("/students")
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/students/{id}")
    public Optional<Student> findStudentById(@PathVariable Integer id) {
        return studentService.findStudentById(id);
    }

}

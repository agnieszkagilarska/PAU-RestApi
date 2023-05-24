package com.example.demo.controller;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @GetMapping("student/all")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    @GetMapping("student/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentRepository.findById(id).orElseThrow();
    }
    @PostMapping("student/add")
    public void addStudent(Student student){
        studentRepository.save(student);
    }
    @PatchMapping("student/update")
    public void updateStudent(Student student){
        studentRepository.save(student);
    }
    @DeleteMapping("student/delete")
    public void deleteStudent(Student student){
        studentRepository.delete(student);
    }
    @DeleteMapping("student/delete/{id}")
    public void deleteStudentById(@PathVariable Integer id){
        studentRepository.deleteById(id);
    }



}

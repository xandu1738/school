package com.admin.school.controllers;

import com.admin.school.entities.StudentEntity;
import com.admin.school.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<StudentEntity> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<StudentEntity> findStudentById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }
    @PostMapping("/")
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity){
        return studentService.saveStudent(studentEntity);
    }
    @PutMapping("/")
    public StudentEntity updateStudent(@RequestBody StudentEntity studentEntity){
        return studentService.updateStudent(studentEntity);
    }
    @DeleteMapping("/{id}")
    void deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }
}

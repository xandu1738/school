package com.admin.school.services;

import com.admin.school.entities.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<StudentEntity> findAllStudents();
    Optional<StudentEntity> findById(Long id);
    StudentEntity saveStudent(StudentEntity studentEntity);
    StudentEntity updateStudent(StudentEntity studentEntity);
    void deleteStudent(Long id);
}

package com.admin.school.services.impl;

import com.admin.school.entities.StudentEntity;
import com.admin.school.repositories.StudentRepository;
import com.admin.school.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentEntity> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentEntity updateStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

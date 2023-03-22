package com.admin.school.entities;

import javax.persistence.*;

@Entity
@Table(name="students")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    public Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "gender")
    public String gender;
    @Column(name = "grade")
    public String grade;
    public StudentEntity() {
    }

    public StudentEntity(Long id, String name, String gender, String grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

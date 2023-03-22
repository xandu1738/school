package com.admin.school.entities;

import javax.persistence.*;

@Entity
@Table(name = "staff")
public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    public Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "gender")
    public String gender;
    @Column(name = "role")
    public String role;
    public StaffEntity() {
    }

    public StaffEntity(Long id, String name, String gender, String role) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

package com.admin.school.services;

import com.admin.school.entities.StaffEntity;

import java.util.List;
import java.util.Optional;


public interface StaffService {
    List<StaffEntity> findAllStaff();
    Optional<StaffEntity> findStaffById(Long id);
    StaffEntity saveStaff(StaffEntity staffEntity);
    StaffEntity updateStaff(StaffEntity staffEntity);

    void deleteStuff(Long id);
}

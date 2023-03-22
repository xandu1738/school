package com.admin.school.services.impl;

import com.admin.school.entities.StaffEntity;
import com.admin.school.repositories.Staffrepository;
import com.admin.school.services.StaffService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService {
    private final Staffrepository staffrepository;

    public StaffServiceImpl(Staffrepository staffrepository) {
        this.staffrepository = staffrepository;
    }

    @Override
    public List<StaffEntity> findAllStaff() {
        return staffrepository.findAll();
    }

    @Override
    public Optional<StaffEntity> findStaffById(Long id) {
        return staffrepository.findById(id);
    }

    @Override
    public StaffEntity saveStaff(StaffEntity staffEntity) {
        return staffrepository.save(staffEntity);
    }

    @Override
    public StaffEntity updateStaff(StaffEntity staffEntity) {
        return staffrepository.save(staffEntity);
    }

    @Override
    public void deleteStuff(Long id) {
        staffrepository.deleteById(id);
    }
}

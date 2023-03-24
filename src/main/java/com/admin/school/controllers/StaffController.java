package com.admin.school.controllers;

import com.admin.school.entities.StaffEntity;
import com.admin.school.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffEntity> findAllStaff(){return staffService.findAllStaff();}

    @GetMapping("/{id}")
    public Optional<StaffEntity> getStaffById(@PathVariable("id") Long id){return staffService.findStaffById(id);}

    @PostMapping
    public StaffEntity saveStaff(@RequestBody StaffEntity staffEntity){
        return staffService.saveStaff(staffEntity);
    }
    @PutMapping
    public StaffEntity updateEntity(@RequestBody StaffEntity staffEntity){
        return staffService.updateStaff(staffEntity);
    }
    @DeleteMapping("/{id}")
    void deleteStaff(@PathVariable("id") Long id){
        staffService.deleteStuff(id);
    }
}

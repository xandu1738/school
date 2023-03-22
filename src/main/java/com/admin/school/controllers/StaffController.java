package com.admin.school.controllers;

import com.admin.school.entities.StaffEntity;
import com.admin.school.services.StaffService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StaffController {
    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/staff")
    public List<StaffEntity> findAllStaff(){return staffService.findAllStaff();}

    @GetMapping("/staff/{id}")
    public Optional<StaffEntity> getStaffById(@PathVariable("id") Long id){return staffService.findStaffById(id);}

    @PostMapping("/staff")
    public StaffEntity saveStaff(@RequestBody StaffEntity staffEntity){
        return staffService.saveStaff(staffEntity);
    }
    @PutMapping("/staff")
    public StaffEntity updateEntity(@RequestBody StaffEntity staffEntity){
        return staffService.updateStaff(staffEntity);
    }
    @DeleteMapping("/staff/{id}")
    void deleteStaff(@PathVariable("id") Long id){
        staffService.deleteStuff(id);
    }
}

package com.admin.school.repositories;

import com.admin.school.entities.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Staffrepository extends JpaRepository<StaffEntity, Long> {
}

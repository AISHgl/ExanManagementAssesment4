package com.globallogic.springexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.springexam.entity.Staff;

public interface StaffRepo extends JpaRepository<Staff,Integer> {

}

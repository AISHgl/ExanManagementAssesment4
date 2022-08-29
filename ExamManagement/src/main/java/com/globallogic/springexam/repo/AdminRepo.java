package com.globallogic.springexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.springexam.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin,Integer>{

}

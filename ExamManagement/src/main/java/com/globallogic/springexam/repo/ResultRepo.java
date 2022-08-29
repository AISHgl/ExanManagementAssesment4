package com.globallogic.springexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.springexam.entity.Result;

public interface ResultRepo extends JpaRepository<Result,Integer>{

}

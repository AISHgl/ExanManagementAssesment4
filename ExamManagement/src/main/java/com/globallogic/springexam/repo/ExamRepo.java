package com.globallogic.springexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.springexam.entity.Exam;

public interface ExamRepo  extends JpaRepository<Exam,Integer>{


}

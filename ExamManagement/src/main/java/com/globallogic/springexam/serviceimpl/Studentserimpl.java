package com.globallogic.springexam.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.springexam.entity.Exam;
import com.globallogic.springexam.entity.Result;
import com.globallogic.springexam.entity.Student;
import com.globallogic.springexam.repo.ExamRepo;
import com.globallogic.springexam.repo.ResultRepo;
import com.globallogic.springexam.repo.StudentRepo;
import com.globallogic.springexam.services.StudentService;
@Component
public class Studentserimpl implements StudentService{
@Autowired
StudentRepo str;
@Autowired
ResultRepo resr;
@Autowired 
ExamRepo exr
;

	@Override
	public List<Student> showdet() {
		
		return str.findAll();
	}

	@Override
	public List<Result> showres() {
		// TODO Auto-generated method stub
		return resr.findAll();
	}

	@Override
	public List<Exam> viewexam() {
		// TODO Auto-generated method stub
		return exr.findAll();
	}

	@Override
	public String attemptexam(int id) {
		// TODO Auto-generated method stub
	
		return "Attempting the exam";
	}

	@Override
	public String adddet(Student s) {
		str.save(s);
		return "Data addedd Successfully";
	}
/*
 @Override
	public List<String> showStudentName() {
		
		return str.StudentsByName();
	}*/

}

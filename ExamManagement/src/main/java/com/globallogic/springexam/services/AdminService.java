package com.globallogic.springexam.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.springexam.entity.Admin;
import com.globallogic.springexam.entity.Exam;
import com.globallogic.springexam.entity.Result;
import com.globallogic.springexam.entity.Student;

@Service
public interface AdminService {
	
	
public String adddet(Admin ad);

//public List<String> showName();
public List<Result> addResult();
public String addExam(Exam ex);
public String addStud(Student s);
public List<Admin> alldet();
}

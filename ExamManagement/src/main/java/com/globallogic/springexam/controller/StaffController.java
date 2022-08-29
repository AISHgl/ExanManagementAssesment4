package com.globallogic.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.springexam.entity.Exam;
import com.globallogic.springexam.entity.Result;
import com.globallogic.springexam.entity.Staff;
import com.globallogic.springexam.entity.Student;
import com.globallogic.springexam.services.ExamService;
import com.globallogic.springexam.services.ResultService;
import com.globallogic.springexam.services.StaffService;
import com.globallogic.springexam.services.StudentService;

@RestController
@RequestMapping("/Staff")
public class StaffController {
	@Autowired
	ExamService exs;
	@Autowired
	ResultService reser;
	@Autowired
	StaffService stafser;
	@Autowired
	StudentService stdr;
	
	
	@GetMapping("/")
	public List<Staff> showalldet(){
		return stafser.alldet();
	}
	
	@PostMapping("/exam")
	public String addexamdet(Exam st) {
		return exs.adddet(st);
	}
	@PostMapping("/result")
	public String addresultdet(Result st) {
		return reser.adddet(st);
	}
	@PostMapping("/student")
	public String addstudentdet(Student st) {
		return stdr.adddet(st);
	}
}

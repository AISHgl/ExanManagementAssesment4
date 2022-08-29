package com.globallogic.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.springexam.entity.Student;
import com.globallogic.springexam.services.ExamService;
import com.globallogic.springexam.services.ResultService;

import com.globallogic.springexam.services.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	ExamService exs;
	@Autowired
	ResultService reser;	
	@Autowired
	StudentService stdr;
	
	@GetMapping("/")
	public List<Student> show(){
	return	stdr.showdet();
	}

}

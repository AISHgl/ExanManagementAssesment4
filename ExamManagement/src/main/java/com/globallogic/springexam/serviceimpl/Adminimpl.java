package com.globallogic.springexam.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.springexam.entity.Admin;
import com.globallogic.springexam.entity.Exam;
import com.globallogic.springexam.entity.Result;
import com.globallogic.springexam.entity.Student;
import com.globallogic.springexam.repo.AdminRepo;

import com.globallogic.springexam.repo.StaffRepo;

import com.globallogic.springexam.services.AdminService;
import com.globallogic.springexam.services.ExamService;
import com.globallogic.springexam.services.ResultService;
import com.globallogic.springexam.services.StudentService;

@Component
public class Adminimpl implements AdminService{
@Autowired
AdminRepo adr;

@Autowired
StaffRepo stadr;

@Autowired
StudentService stdr;

@Autowired
ExamService exrr;

@Autowired
ResultService resr;

	@Override
	public String adddet(Admin ad) {
		adr.save(ad);
		return "Data addedd Successfully";
	}
/*
	@Override
	public String deldet(int id) {
		adr.deleteById(id);
		return "Data deleted Successfully";
	}

	@Override
	public String updatedet(Admin ad) {
		adr.save(ad);
		return "Data deleted Successfully";
	}
*/
	/*@Override
	public List<String> showName() {
		
		return stdr.showStudentName();
	}*/

	@Override
	public List<Result> addResult() {
		
		return resr.alldet();
	}

	@Override
	public String addExam(Exam ex) {
		exrr.adddet(ex);
		return "Details added Sucessfully";
	}

	@Override
	public String addStud(Student s) {
		stdr.adddet(s);
		return "Data addedd Sucessfully";
	}

	@Override
	public List<Admin> alldet() {
		
		return adr.findAll();
	}

}

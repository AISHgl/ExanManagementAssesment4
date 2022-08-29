package com.globallogic.springexam.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired
;
import org.springframework.stereotype.Component;

import com.globallogic.springexam.entity.Exam;
import com.globallogic.springexam.entity.Result;
import com.globallogic.springexam.entity.Staff;
import com.globallogic.springexam.entity.Student;

import com.globallogic.springexam.repo.StaffRepo;
import com.globallogic.springexam.services.ExamService;
import com.globallogic.springexam.services.ResultService;
import com.globallogic.springexam.services.StaffService;
import com.globallogic.springexam.services.StudentService;
@Component
public class Staffservimpl implements StaffService {


@Autowired
StaffRepo stadr;

@Autowired
StudentService stdr;

@Autowired
ExamService exrr;

@Autowired
ResultService resr;




	@Override
	public String adddet(Staff s) {
		stadr.save(s);
		return "Data Added Sucessfully" ;
	}



	@Override
	public String updatedet(Staff ad) {
		stadr.save(ad);
		return  "Data Updated Sucessfully" ;
	}

	@Override
	public List<Student> showStud(String name) {
		
		return stdr.showdet();
	}

	@Override
	public String addResult(Result rs) {
		resr.adddet(rs);
		return "Data of Result is added" ;
	}

	@Override
	public String addExam(Exam ex) {
	exrr.adddet(ex);
		return "Data of Exam is added";
	}

	@Override
	public String addStud(Student s) {
		// TODO Auto-generated method stub\
		stdr.adddet(s);
		return "Data of Sudent is added";
	}

	@Override
	public List<Staff> alldet() {
		// TODO Auto-generated method stub
		return stadr.findAll();
	}

}

package com.globallogic.springexam.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.springexam.entity.Exam;
import com.globallogic.springexam.repo.ExamRepo;
import com.globallogic.springexam.services.ExamService;
@Component
public class examserimpl implements ExamService {
@Autowired
ExamRepo exr;
	@Override
	public String adddet(Exam e) {
		exr.save(e);
		System.out.println(e);
		return "Exam details added Successfully";
	}

	@Override
	public String updatedet(Exam e) {
		exr.save(e);
		return  "Exam details updated Successfully";
	}

	@Override
	public String deldet(int id) {
		// TODO Auto-generated method stub
		exr.deleteById(id);
		return " Exam details deleted Successfully";
	}

	@Override
	public List<Exam> alldet() {
		// TODO Auto-generated method stub
		return exr.findAll();
	}

}

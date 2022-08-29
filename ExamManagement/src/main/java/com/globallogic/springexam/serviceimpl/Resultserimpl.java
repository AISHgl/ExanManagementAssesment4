package com.globallogic.springexam.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.globallogic.springexam.entity.Result;
import com.globallogic.springexam.repo.ResultRepo;
import com.globallogic.springexam.services.ResultService;
@Component
public class Resultserimpl implements ResultService{
@Autowired
ResultRepo resr;
	@Override
	public String adddet(Result rs) {
		resr.save(rs);
		return "Result addedd Successfully";
	}

	@Override
	public String updatedet(Result rs) {
		resr.save(rs);
		return "Result updated Successfully";
	}

	@Override
	public List<Result> alldet() {
		// TODO Auto-generated method stub
		return resr.findAll();
	}


}

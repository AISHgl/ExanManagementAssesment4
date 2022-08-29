package com.globallogic.springexam.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.springexam.entity.Exam;

@Service
public interface ExamService {
	public String adddet(Exam e);
	public String updatedet(Exam e);
	public String deldet(int id);
public List<Exam> alldet();
}

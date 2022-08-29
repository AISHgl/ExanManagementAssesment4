package com.globallogic.springexam.services;

import java.util.List;

import org.springframework.stereotype.Service;


import com.globallogic.springexam.entity.Exam;
import com.globallogic.springexam.entity.Result;
import com.globallogic.springexam.entity.Staff;
import com.globallogic.springexam.entity.Student;

@Service
public interface StaffService {
public String adddet(Staff s);

public String updatedet(Staff ad);
public List<Student> showStud(String name);
public String addResult(Result rs) ;
public String addExam(Exam ex);
public String addStud(Student s);
public List<Staff> alldet();

}

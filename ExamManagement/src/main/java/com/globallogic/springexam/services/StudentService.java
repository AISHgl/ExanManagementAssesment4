package com.globallogic.springexam.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.globallogic.springexam.entity.Exam;
import com.globallogic.springexam.entity.Result;
import com.globallogic.springexam.entity.Student;

@Service
public interface StudentService {
public List<Student>showdet();
public List<Result> showres();
public List<Exam> viewexam();
public String attemptexam(int id);
public String adddet(Student s);
//public List<String> showStudentName();
}

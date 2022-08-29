package com.globallogic.springexam.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@OneToMany
	List<Exam> exam;
	@OneToOne
	Result rs;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, List<Exam> exam, Result rs) {
		super();
		this.id = id;
		this.name = name;
		this.exam = exam;
		this.rs = rs;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", exam=" + exam + ", rs=" + rs + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}

	public Result getRs() {
		return rs;
	}

	public void setRs(Result rs) {
		this.rs = rs;
	}

}

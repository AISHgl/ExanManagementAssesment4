package com.globallogic.springexam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "result")
public class Result {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	int marks;
	@Column
	String stat;
	@OneToOne
	Exam ex;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", marks=" + marks + ", stat=" + stat + ", ex=" + ex + "]";
	}

	public Result(int id, int marks, String stat, Exam ex) {
		super();
		this.id = id;
		this.marks = marks;
		this.stat = stat;
		this.ex = ex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public Exam getEx() {
		return ex;
	}

	public void setEx(Exam ex) {
		this.ex = ex;
	}

}

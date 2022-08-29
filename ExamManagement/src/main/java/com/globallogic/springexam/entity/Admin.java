package com.globallogic.springexam.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@ManyToMany
	List<Student> st;
	@ManyToMany
	List<Staff> staf;
	@ManyToMany
	List<Result> rst;
	@ManyToMany
	List<Exam> ex;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int id, String name, List<Student> st, List<Staff> staf, List<Result> rst, List<Exam> ex) {
		super();
		this.id = id;
		this.name = name;
		this.st = st;
		this.staf = staf;
		this.rst = rst;
		this.ex = ex;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", st=" + st + ", staf=" + staf + ", rst=" + rst + ", ex=" + ex
				+ "]";
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

	public List<Student> getSt() {
		return st;
	}

	public void setSt(List<Student> st) {
		this.st = st;
	}

	public List<Staff> getStaf() {
		return staf;
	}

	public void setStaf(List<Staff> staf) {
		this.staf = staf;
	}

	public List<Result> getRst() {
		return rst;
	}

	public void setRst(List<Result> rst) {
		this.rst = rst;
	}

	public List<Exam> getEx() {
		return ex;
	}

	public void setEx(List<Exam> ex) {
		this.ex = ex;
	}

}

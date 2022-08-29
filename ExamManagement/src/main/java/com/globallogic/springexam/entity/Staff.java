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
@Table(name = "staff")
public class Staff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String name;
	@Column
	String phone;
	@ManyToMany
	List<Student> stud;
	@ManyToMany
	List<Result> res;
	@ManyToMany
	List<Exam> exa;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Staff(int id, String name, String phone, List<Student> stud, List<Result> res, List<Exam> exa) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.stud = stud;
		this.res = res;
		this.exa = exa;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Student> getStud() {
		return stud;
	}

	public void setStud(List<Student> stud) {
		this.stud = stud;
	}

	public List<Result> getRes() {
		return res;
	}

	public void setRes(List<Result> res) {
		this.res = res;
	}

	public List<Exam> getExa() {
		return exa;
	}

	public void setExa(List<Exam> exa) {
		this.exa = exa;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", phone=" + phone + ", stud=" + stud + ", res=" + res + ", exa="
				+ exa + "]";
	}

}

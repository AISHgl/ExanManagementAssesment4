package com.globallogic.springexam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String sub;
	@Column
	String course;
	@Column
	String branch;
	@Column
	int noq;
	@Column
	int time;
	@Column
	String status;

	public Exam(int id, String sub, String course, String branch, int noq, int time, String status) {
		super();
		this.id = id;
		this.sub = sub;
		this.course = course;
		this.branch = branch;
		this.noq = noq;
		this.time = time;
		this.status = status;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", sub=" + sub + ", course=" + course + ", branch=" + branch + ", noq=" + noq
				+ ", time=" + time + ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getNoq() {
		return noq;
	}

	public void setNoq(int noq) {
		this.noq = noq;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

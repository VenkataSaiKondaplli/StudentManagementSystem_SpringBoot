package com.sai.StudentEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studenttable1")
public class StudentEntity {
	@Id
	private long studentHallTicket;
	private String fullName;
	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;
	private int subject5;
	private int totalMarks;
	private float avgMarks;
	private String grade;
	
	public StudentEntity() {
		// TODO Auto-generated constructor stub
	}

	public StudentEntity(long studentHallTicket, String fullName, int subject1, int subject2, int subject3,
			int subject4, int subject5, int totalMarks, float avgMarks, String grade) {
		super();
		this.studentHallTicket = studentHallTicket;
		this.fullName = fullName;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
		this.totalMarks = totalMarks;
		this.avgMarks = avgMarks;
		this.grade = grade;
	}

	public long getStudentHallTicket() {
		return studentHallTicket;
	}

	public void setStudentHallTicket(long studentHallTicket) {
		this.studentHallTicket = studentHallTicket;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getSubject1() {
		return subject1;
	}

	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	public int getSubject2() {
		return subject2;
	}

	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	public int getSubject3() {
		return subject3;
	}

	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	public int getSubject4() {
		return subject4;
	}

	public void setSubject4(int subject4) {
		this.subject4 = subject4;
	}

	public int getSubject5() {
		return subject5;
	}

	public void setSubject5(int subject5) {
		this.subject5 = subject5;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public float getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(float avgMarks) {
		this.avgMarks = avgMarks;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	

}

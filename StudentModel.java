package com.sai.StudentModel;

public class StudentModel {
	
	private long studentHallTicket;
	private String fullName;
	private int subject1;
	private int subject2;
	private int subject3;
	private int subject4;
	private int subject5;
	
public StudentModel() {
	// TODO Auto-generated constructor stub
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

public StudentModel(long studentHallTicket, String fullName, int subject1, int subject2, int subject3, int subject4,
		int subject5) {
	super();
	this.studentHallTicket = studentHallTicket;
	this.fullName = fullName;
	this.subject1 = subject1;
	this.subject2 = subject2;
	this.subject3 = subject3;
	this.subject4 = subject4;
	this.subject5 = subject5;
}	




}

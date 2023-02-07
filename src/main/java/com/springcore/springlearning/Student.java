package com.springcore.springlearning;

public class Student {
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRollno=" + studentRollno
				+ ", studentAddress=" + studentAddress + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollno() {
		return studentRollno;
	}
	public void setStudentRollno(String studentRollno) {
		this.studentRollno = studentRollno;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentRollno, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentRollno = studentRollno;
		this.studentAddress = studentAddress;
	}
	private int studentId;
	private String studentName;
	private String studentRollno;
	private String studentAddress;
}

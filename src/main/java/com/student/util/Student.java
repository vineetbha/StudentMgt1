package com.student.util;

import java.util.List;

public class Student {
	
	private int studentId;
	private String rollNumber;
	private String name;
	private String standard;
	private String email;
	private List<Relative> relative;
	
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Relative> getRelative() {
		return relative;
	}

	public void setRelative(List<Relative> relative) {
		this.relative = relative;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", standard=" + standard + ", email=" + email
				+ ", relative=" + relative + "]";
	}

}

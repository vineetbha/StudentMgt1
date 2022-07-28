package com.student.util;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_master")
public class StudentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;

	private String rollNumber;
	private String name;
	private String standard;
	private String email;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "student_relatives_mapping")
	private List<RelativeModel> relatives;

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

	public List<RelativeModel> getRelatives() {
		return relatives;
	}

	public void setRealtives(List<RelativeModel> softSkills) {
		this.relatives = softSkills;
	}

	@Override
	public String toString() {
		return "StudentModel [studentId=" + studentId + ", rollNumber=" + rollNumber + ", name=" + name + ", standard="
				+ standard + ", email=" + email + ", softSkills=" + relatives + "]";
	}

}

package com.student.util;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "relative_master")
public class RelativeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int relativeId;

	private String rName;
	private String relation;
	private String address;

	public int getStudentId() {
		return relativeId;
	}

	public void setStudentId(int studentId) {
		this.relativeId = studentId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "RelativeModel [studentId=" + relativeId + ", rName=" + rName + ", relation=" + relation + ", address="
				+ address + "]";
	}

}

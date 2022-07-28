package com.student.util;

public class Relative {
	private String rName;
	private String relation;
	private String address;

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
		return "Relative [rName=" + rName + ", relation=" + relation + ", address=" + address + "]";
	}

}

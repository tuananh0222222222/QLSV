package com.Model;

public class Classroom {

	private int ClassId;
	private String ClassName;
	public Classroom(int classId, String className) {
		super();
		ClassId = classId;
		ClassName = className;
	}
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClassId() {
		return ClassId;
	}
	public void setClassId(int classId) {
		ClassId = classId;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	

}

package com.Model;

public class Subject {

	private int 	SubjectId;
	private String SubjectName;
	
	public Subject(int subjectId, String subjectName) {
		super();
		SubjectId = subjectId;
		SubjectName = subjectName;
	}

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	
}

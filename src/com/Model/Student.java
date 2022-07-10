package com.Model;



public class Student {

	private int StudentId ;
	private String StudentName;
	private int Birth;
	private String Gender;
	private int Phone;
	private String Address;
	private int ClassId ;

	private String ClassName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String studentName, int birth, String gender, int phone, String address, int classId,
			String className) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		Birth = birth;
		Gender = gender;
		Phone = phone;
		Address = address;
		ClassId = classId;
		ClassName = className;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String gender) {
		Gender = gender;
	}

	public int getBirth() {
		return Birth;
	}

	public void setBirth(int birth) {
		Birth = birth;
	}

	

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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
	
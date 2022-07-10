package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import com.Model.Subject;
import com.utils.DbContext;

public class SubjectDAO {

	//lay bang
	public static ArrayList<Subject> getAllSubject(){
		 Connection con = DbContext.ConnectDatabase();
		 ArrayList<Subject> list = null;
		 
		 String sql = "SELECT * FROM subject";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Subject subject = null;
			list = new ArrayList<Subject>();
		
			while(rs.next()){
				subject = new Subject();
				
				subject.setSubjectId(rs.getInt("SubjectId"));
				subject.setSubjectName(rs.getString("SubjectName"));
			
				list.add(subject);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	//them
	
	public static boolean AddSubject(Subject subject){
		Connection con = DbContext.ConnectDatabase();
		
		String sql = "INSERT INTO `subject`(`SubjectId`, `SubjectName`) VALUES ('"+subject.getSubjectId()+"','"+subject.getSubjectName()+"')";
		PreparedStatement ps ;
		try {
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	//sua
	
	public static Subject getSubjectId(int Id){
		Connection con = DbContext.ConnectDatabase();
		Subject subject = new Subject();
		
		String sql = "SELECT * FROM `subject` WHERE SubjectId =" + Id;
		PreparedStatement ps ;
		try {
			ps=con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();// thuc hien truy van
				
			if(rs.next()){
				
				subject.setSubjectId(rs.getInt("SubjectId"));
				subject.setSubjectName(rs.getString("SubjectName"));
	
			}
			return subject;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static boolean updateClassroom(Subject subject){
		Connection con = DbContext.ConnectDatabase();
		String sql = "UPDATE `subject` SET `SubjectId`='"+subject.getSubjectId()+"',`SubjectName`='"+subject.getSubjectName()+"' WHERE SubjectId="+subject.getSubjectId();
		PreparedStatement ps ;
		try {
			ps=con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	//xoa
	
	public static boolean DelSubject(int SubjectId){
		Connection con = DbContext.ConnectDatabase();
		String sql = "DELETE FROM `subject` WHERE SubjectId=" + SubjectId;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
}

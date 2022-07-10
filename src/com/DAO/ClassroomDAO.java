package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Model.Classroom;

import com.utils.DbContext;

public class ClassroomDAO {
	//lay id
	public static ArrayList<Classroom> getClassroom(){
		 Connection con = DbContext.ConnectDatabase();
		 ArrayList<Classroom> list = null;
		 
		 String sql = "SELECT * FROM classroom";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Classroom classroom = null;
			list = new ArrayList<Classroom>();
		
			while(rs.next()){
				classroom = new Classroom();
				classroom.setClassId(rs.getInt("ClassId"));
				classroom.setClassName(rs.getString("ClassName"));
			
				list.add(classroom);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//them
	public static boolean Addclassroom(Classroom classroom){
		Connection con = DbContext.ConnectDatabase();
		
		String sql = "INSERT INTO `classroom`(`ClassId`, `ClassName`) VALUES ('"+classroom.getClassId()+"','"+classroom.getClassName()+"')";
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
	public static Classroom getClassroomId(int Id){
		Connection con = DbContext.ConnectDatabase();
		Classroom classroom = new Classroom();
		
		String sql = "SELECT * FROM `classroom` WHERE ClassId =" + Id;
		PreparedStatement ps ;
		try {
			ps=con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();// thuc hien truy van
				
			if(rs.next()){
				
				classroom.setClassId(rs.getInt("ClassId"));
				classroom.setClassName(rs.getString("ClassName"));
	
			}
			return classroom;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static boolean updateClassroom(Classroom classroom){
		Connection con = DbContext.ConnectDatabase();
		String sql = "UPDATE `classroom` SET `ClassId`='"+classroom.getClassId()+"',`ClassName`='"+classroom.getClassName()+"' WHERE ClassId= "+classroom.getClassId();
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
	
	public static boolean DelClassroom(int ClassId){
		Connection con = DbContext.ConnectDatabase();
		String sql = "DELETE FROM `classroom` WHERE ClassId= " + ClassId;
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
	

}

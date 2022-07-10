
<%@page import="com.DAO.StudentDAO"%>
<%@page import="com.Model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Danh sách sinh viên</h1>
                        <a href="./StudentAdd" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                                class="fas fa-plus fa-sm text-white-50"></i> Thêm sinh viên</a>
                    </div>

                    <!-- Content Row -->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary"></h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                            
                              
                    <div class="table">
                         
                        <div class="table_section">
                         	
                         	  <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                         <tr>
                                        <th>ID</th>
                                        <th>Họ tên</th>
                                        <th>Giới tính</th>
                                        <th>Năm sinh</th>
                                        <th>Số điện thoại</th>
                                        <th>Địa chỉ</th>
                                        <th>Lớp</th>
                                     
                                        
                                        <!-- <th>Hoạt động</th> -->
                                    </tr>
                                    </thead>
                                   
                                    <tbody>
                                	<%for(Student item : StudentDAO.getStudent()){
                                		%>
	                                	<tr>
	                                        <td><%=item.getStudentId()%></td>
	                                        <td><p><%=item.getStudentName() %></p></td>
	                                         <td><%=item.getGender()%></td>
	                                        <td><%=item.getBirth()%></td>
	                                          <td><%=item.getPhone()%></td>
	                                           <td><%=item.getAddress()%></td>
	                                            <td><%=item.getClassName()%></td>
	                                    
	                                        <td> 
	                                        <a href="./StudentEdit?Id=<%=item.getStudentId()%> " class="btn-sm btn btn-primary">Chi tiết</a>
	                                        <a href="./StudentDel?Id=<%=item.getStudentId()%>" class="btn-sm btn btn-danger">Xóa</a>
	                                        </td>
	                                    </tr>
	                                		
                                	<%} %>                          
                                </tbody>
                                </table>
                        </div>
                    
                           	
                       
                     </div>
                            
                  
                    </div>
                    <!-- Content Row -->
                    
                    
                   


<%@page import="com.DAO.StudentDAO"%>
<%@page import="com.Model.Student"%>
<%@page import="com.DAO.ClassroomDAO"%>
<%@page import="com.Model.Classroom"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


      <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Thông tin lớp</h1>
                        
                    </div>

                    <!-- Content Row -->
                    <%
                    	int Id = Integer.parseInt(request.getParameter("Id"));
                        Student student = StudentDAO.getStudentId(Id);
                    %>
                  
                    
                    
            <!-- Content Row -->
			<div class="card shadow mb-4">
			
		
				<div class="card-body">
					<div class="table-responsive">
					
		                     <form  action="./StudentEdit" method="post" style="width: 700px;">	
		                     <div class="form-group">
		                            <label for="">Id</label>
		                            <input type="text" class="form-control" value="<%=student.getStudentId()%>" name="student-id" readonly="readonly" >
		                        </div>                  
		                        <div class="form-group">
		                            <label for="">Giới tính</label>
		                            <input type="text" class="form-control" value="<%=student.getStudentName() %>" name="student-name" >
		                        </div>
						         <div class="form-group">
		                            <label for="">Giới tính</label>
		                            <input type="text" class="form-control" value="<%=student.getGender() %>" name="student-gender" >
		                        </div>
		                        
		                          <div class="form-group">
		                            <label for="">Năm sinh</label>
		                            <input type="text" class="form-control" value="<%=student.getBirth() %>" name="student-bitrh" >
		                        </div>
		                        
		                        
		                        <div class="form-group">
		                            <label for="">Số điện thoại</label>
		                            <input type="text" class="form-control" value="<%=student.getPhone()%>" name="student-phone" >
		                        </div>
		                        
		                        <div class="form-group">
		                            <label for="">Địa chỉ</label>
		                            <input type="text" class="form-control" value="<%=student.getAddress() %>" name="student-address" >
		                        </div>
		                    
                        
						       <div class="form-row">
			                            <div class="col-auto my-1">
			                                <label for="inlineFormCustomSelect">Lớp </label>
			                                <select class="custom-select mr-sm-2" id="inlineFormCustomSelect" name="student-class">
			                                  <option selected>Lớp</option>
			                                  <%for(Classroom item : ClassroomDAO.getClassroom()) {	
			                                	  if(item.getClassId() == student.getClassId()){
			                                		 %>
			                                		 
					                                  <option value="<%=item.getClassId()%>" selected><%=item.getClassName() %></option>
			                                		 <% 
			                                	  }else{
			                                		  %>
			                                		  	  <option value="<%=item.getClassId()%>"><%=item.getClassName() %></option>
			                                		  <% 
			                                	  }
			                                	  %>
				                                	  
			                                     <% } %>
			                                 
			                                </select>
			                              </div>
			                     	 </div>
			                      
		                 
			                        <div class="form-group  mt-4">
			                        <button type="submit" class="ml-2 btn btn-primary">Thêm</button>
			                        <a href="./StudentList" class="btn  btn-info">Quay lại</a>
			                        </div>
	                      	</form>
				</div>
			</div>
		                  
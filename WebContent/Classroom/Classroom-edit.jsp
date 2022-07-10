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
                        Classroom classroom = ClassroomDAO.getClassroomId(Id);
                    %>
                     <form action="./ClassroomEdit" method="post" style="width: 700px;">
                        <div class="form-group">
                            <label for="exampleModalLabel" class="ml-3">ID</label>
                            <input type="text" class="form-control"  value="<%=classroom.getClassId()%>" name="classroom-id" readonly="readonly">
                        </div>
                        <div class="form-group">
                            <label for="exampleModalLabel" class="ml-3">Lớp</label>
                            <input type="text" class="form-control" value="<%=classroom.getClassName() %>" name="classroom-name" >
                        </div>
                       <div class="form-group ">
                        <button type="submit" class="btn btn-sm btn-primary ml-2">Sửa</button>
                        <a href="./classroomlist" class="btn btn-sm btn-info">Quay lại</a>
                        </div>
                      </form>
                        </div>
                       
                    </div>
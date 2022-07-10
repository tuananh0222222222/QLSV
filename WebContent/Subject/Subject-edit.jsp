<%@page import="com.DAO.SubjectDAO"%>
<%@page import="com.Model.Subject"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


      <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Thông tin lớp</h1>
                        
                    </div>

                    <!-- Content Row -->
                    <%
                    	int Id = Integer.parseInt(request.getParameter("Id"));
                        Subject subject = SubjectDAO.getSubjectId(Id);
                    %>
                     <form action="./SubjectEdit" method="post" style="width: 700px;">
                        <div class="form-group">
                            <label for="exampleModalLabel" class="ml-3">ID</label>
                            <input type="text" class="form-control"  value="<%=subject.getSubjectId() %>" name="subject-id" readonly="readonly">
                        </div>
                        <div class="form-group">
                            <label for="exampleModalLabel" class="ml-3">Lớp</label>
                            <input type="text" class="form-control" value="<%=subject.getSubjectName() %>" name="subject-name" >
                        </div>
                       <div class="form-group ">
                        <button type="submit" class="btn btn-sm btn-primary ml-2">Sửa</button>
                        <a href="./SubjectList" class="btn btn-sm btn-info">Quay lại</a>
                        </div>
                      </form>
                        </div>
                       
                    </div>
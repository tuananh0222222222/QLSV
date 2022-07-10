
<%@page import="com.DAO.ClassroomDAO"%>
<%@page import="com.Model.Classroom"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
                        <h1 class="h3 mb-0 text-gray-800">Danh sách lớp</h1>
                        <a href="./ClassroomAdd" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                                class="fas fa-plus fa-sm text-white-50"></i> Thêm lớp</a>
                    </div>

                    <!-- Content Row -->
                    
                    <div class="table">
                        <!-- <div class="table_header">
                            <p>Product Details</p>
                            <div> <input placeholder="product" /> <button class="add_new">+ Add New</button> </div>
                        </div> -->
                        <div class="table_section">
                            <table>
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Lớp</th>
                                     
                                        
                                        <!-- <th>Hoạt động</th> -->
                                    </tr>
                                </thead>
                                <tbody>
                                	<%for(Classroom item : ClassroomDAO.getClassroom()){
                                		%>
	                                	<tr>
	                                        <td><%=item.getClassId() %></td>
	                                        <td><p><%=item.getClassName() %></p></td>
	                                    
	                                        <td> 
	                                        <a href="./ClassroomEdit?Id=<%=item.getClassId() %>" class="btn-sm btn btn-primary">Chi tiết</a>
	                                        <a href="./ClassroomDel?Id=<%=item.getClassId() %>" class="btn-sm btn btn-danger">Xóa</a>
	                                        </td>
	                                    </tr>
	                                		
                                	<%} %>                          
                                </tbody>
                            </table>
                        </div>
                        <div class="pagination">
                            <nav aria-label="Page navigation example">
                                <ul class="pagination">
                                  <li class="page-item">
                                    <a class="page-link" href="#" aria-label="Previous">
                                      <span aria-hidden="true">&laquo;</span>
                                      <span class="sr-only">Previous</span>
                                    </a>
                                  </li>
                                  <li class="page-item"><a class="page-link" href="#">1</a></li>
                                  <li class="page-item"><a class="page-link" href="#">2</a></li>
                                  <li class="page-item"><a class="page-link" href="#">3</a></li>
                                  <li class="page-item">
                                    <a class="page-link" href="#" aria-label="Next">
                                      <span aria-hidden="true">&raquo;</span>
                                      <span class="sr-only">Next</span>
                                    </a>
                                  </li>
                                </ul>
                              </nav>
                        </div>
                    </div>
                    <!-- Content Row -->
                   


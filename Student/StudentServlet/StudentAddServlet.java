package StudentServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.DAO.StudentDAO;

import com.Model.Student;



/**
 * Servlet implementation class StudentAddServlet
 */
@WebServlet("/StudentAdd")
public class StudentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("VIEW", "./Student/Student-add.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/Layout.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		Student student = new Student();
		
		String studentname = (request.getParameter("student-name"));
		student.setStudentName(studentname);
	//		
		int studentbirth =Integer.parseInt(request.getParameter("student-bitrh"));
		student.setBirth(studentbirth);
//	
		String studentgender = request.getParameter("student-gender");
		student.setGender(studentgender);
//	
		int studentphone = Integer.parseInt(request.getParameter("student-phone"));
		student.setPhone(studentphone);
//	
		String studentaddress = request.getParameter("student-address");
		student.setAddress(studentaddress);
//	
		String studentclass = request.getParameter("student-class");
		student.setClassId(Integer.parseInt(studentclass));
		
		
		
			
//	PrintWriter pr = response.getWriter();
//	
//	pr.println(studentgender);
	



		
						
				if(StudentDAO.AddStudent(student)){
						response.sendRedirect("./StudentList");
				}else{
					response.sendRedirect("./StudentAdd");
				}
					
					}

}

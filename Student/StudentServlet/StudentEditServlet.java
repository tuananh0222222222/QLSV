package StudentServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.StudentDAO;

import com.Model.Student;


/**
 * Servlet implementation class StudentEditServlet
 */
@WebServlet("/StudentEdit")
public class StudentEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("VIEW", "./Student/Student-edit.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("/Layout.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		Student student = new Student();
		
		int studentid = Integer.parseInt(request.getParameter("student-id"));
		String studentname = request.getParameter("student-name");
		String studentgender = request.getParameter("student-gender");
		int studentbirth =Integer.parseInt(request.getParameter("student-bitrh"));
	
		int studentphone =Integer.parseInt( request.getParameter("student-phone"));
		String studentaddress = request.getParameter("student-address");
		int studentclass = Integer.parseInt(request.getParameter("student-class"));
		
		student.setClassId(studentid);
		student.setClassName(studentname);
		student.setGender(studentgender);
		student.setBirth(studentbirth);
		student.setPhone(studentphone);
		student.setAddress(studentaddress);
		student.setClassId(studentclass);
	
//		PrintWriter ps = response.getWriter();
//		ps.println(studentname);
//		ps.println(studentgender);
//		ps.println(studentbirth);
//		ps.println(studentphone);
//			ps.println(studentaddress);
//		ps.println(studentclass);
		
//		
		if(StudentDAO.UpdateStudent(student)){
			response.sendRedirect("./StudentList");
		}else{
			response.sendRedirect("./StudentAdd");
		}
		
		
	}

}

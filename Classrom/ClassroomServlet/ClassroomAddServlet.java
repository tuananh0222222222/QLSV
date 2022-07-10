package ClassroomServlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.ClassroomDAO;

import com.Model.Classroom;



/**
 * Servlet implementation class ClassroomAddServlet
 */
@WebServlet("/ClassroomAdd")
public class ClassroomAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassroomAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("VIEW", "./Classroom/Classroom-add.jsp");
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
		
		Classroom classroom = new Classroom();
		String classname = request.getParameter("classroomname");
		classroom.setClassName(classname);
		
		
		if(ClassroomDAO.Addclassroom(classroom) ){
			response.sendRedirect("./classroomlist");
		}else{
			response.sendRedirect("./ClassroomAdd");
		}
		
		
		
	}

}

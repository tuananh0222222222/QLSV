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
 * Servlet implementation class ClassroomEditServlet
 */
@WebServlet("/ClassroomEdit")
public class ClassroomEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassroomEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("VIEW", "./Classroom/Classroom-edit.jsp");
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
		
		int Id = Integer.parseInt(request.getParameter("classroom-id"));
		String classroomName = request.getParameter("classroom-name");
		
		
		Classroom classroom = new Classroom();
		classroom.setClassId(Id);
		
		classroom.setClassName(classroomName);
		
		if(ClassroomDAO.updateClassroom(classroom)){
			response.sendRedirect("./classroomlist");
		}else{
			response.sendRedirect("./ClassroomEdit");

		}
		
	}

}

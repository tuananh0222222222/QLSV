package SubjectServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.DAO.SubjectDAO;

import com.Model.Subject;

/**
 * Servlet implementation class SubjectEditServlet
 */
@WebServlet("/SubjectEdit")
public class SubjectEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("VIEW", "./Subject/Subject-edit.jsp");
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
		
		int Id = Integer.parseInt(request.getParameter("subject-id"));
		String subjectName = request.getParameter("subject-name");
		
		
		
		Subject subject = new Subject();
		
		subject.setSubjectId(Id);
		subject.setSubjectName(subjectName);
		
		
		
		if(SubjectDAO.updateClassroom(subject)){
			response.sendRedirect("./SubjectList");
		}else{
			response.sendRedirect("./SubjectEdit");

		}
	}

}

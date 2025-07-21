package master.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.FoodDao;
import master.dto.FoodDto;

/**
 * Servlet implementation class FoodDelServe
 */
@WebServlet("/FoodDelServe")
public class FoodDelServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
		response.setContentType("text/html");
		String fid=request.getParameter("fid");
		FoodDto fdto=new FoodDto();
		fdto.setFid(fid);
		FoodDao fdao=new FoodDao();
		fdao.deleteData(fdto);
		response.sendRedirect("FoodReport.jsp");
		}
		catch(Exception e)
		{
			System.out.println("CATCH");
			request.setAttribute("errorMessage",e.getMessage());
			RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}
	}

}

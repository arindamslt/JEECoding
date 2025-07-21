package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.FoodDao;
import master.dto.FoodDto;

/**
 * Servlet implementation class FoodUpdServe
 */
@WebServlet("/FoodUpdServe")
public class FoodUpdServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String fid=request.getParameter("fid");
		String fname=request.getParameter("fname");
		double price=Double.parseDouble(request.getParameter("price"));
		FoodDto fdto=new FoodDto();
		fdto.setFid(fid);
		fdto.setFname(fname);
		fdto.setPrice(price);
		FoodDao fdao=new FoodDao();
		fdao.updateData(fdto);
		response.sendRedirect("FoodReport.jsp");
	}

}

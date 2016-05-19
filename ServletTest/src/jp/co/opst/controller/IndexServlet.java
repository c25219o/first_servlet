package jp.co.opst.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.opst.constants.Pages;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showIndex(request, response);
	}

	/**
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showIndex(request, response);
//		String errorMessage = request.getParameter("errorMessage");
//		if (errorMessage != null) {
//			request.setAttribute("errorMessage", errorMessage);
//		}
//		request.getRequestDispatcher(Pages.JSP_INDEX).forward(request, response);
	}

	private void showIndex(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String errorMessage = request.getParameter("errorMessage");
		if (errorMessage != null) {
			request.setAttribute("errorMessage", errorMessage);
		}
		super.getServletContext().getRequestDispatcher(Pages.JSP_INDEX).forward(request, response);
	}
}

package jp.co.opst.controller;

import static jp.co.opst.constants.LoginConstants.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.opst.constants.Pages;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = (String)request.getAttribute("userId");
		String pass = (String)request.getAttribute("pass");

		// LOGIN SUCCESS
		if (USER_ID.equals(userId) && PASS.equals(pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("userId", userId);
			response.sendRedirect(Pages.TOP);
			return;

		//LOGIN FAILED
		} else {
			request.setAttribute("errorMessage", "ログイン情報が間違っています。");
//			super.getServletContext().getRequestDispatcher(Pages.CONTEXTPATH).forward(request, response);
			request.getRequestDispatcher(Pages.CONTEXTPATH).forward(request, response);
//			response.sendRedirect(Pages.CONTEXT);
			return;
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// URLダイレクトに入れられたらログイン画面に遷移する
		response.sendRedirect(Pages.CONTEXTPATH);
	}

}

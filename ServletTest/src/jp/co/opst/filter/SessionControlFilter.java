package jp.co.opst.filter;

import static jp.co.opst.constants.Pages.*;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionControlFilter implements Filter {


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// do nothing

	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		String requestURI = httpRequest.getRequestURI();

		if (mustCheckURI(requestURI) && hasNotLoggedIn(httpRequest)) {
			httpResponse.sendRedirect(CONTEXTPATH);
			return;
		}

		System.out.println(requestURI);
		chain.doFilter(request, response);

	}

	private static boolean mustCheckURI(String requestURI) {
		if (CONTEXTPATH.equals(requestURI) || LOGIN.equals(requestURI)) {
			System.out.println(false);
			return false;
		} else if (requestURI.contains(PATTERN_CSS) || requestURI.contains(PATTERN_JS)) {
			System.out.println(false);
			return false;
		} else {
			System.out.println(true);
			return true;
		}
	}

	private static boolean hasNotLoggedIn(HttpServletRequest httpRequest) {
		if (httpRequest.getSession().getAttribute("userId") == null) {
			return true;
		} else {
			return false;
		}
	}


	@Override
	public void destroy() {
		// do nothing

	}



}

package com.baizhi.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
	private ServletContext application;
	@Override
	public void destroy() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO �Զ����ɵķ������
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
			request.setCharacterEncoding("UTF-8");
			// ������Ӧ�ı��뼯
			response.setCharacterEncoding("UTF-8");
			// ��֪�������Ӧ�����ݸ�ʽ
			response.setContentType("text/html");
			chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO �Զ����ɵķ������
		application=filterConfig.getServletContext();
	}

}

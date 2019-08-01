package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiCheckServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//System.out.println("서블릿 요청 성공");	
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String[] sw = req.getParameterValues("sw");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>이름: "+name+"</h1>");
		out.println("<h1>주소: "+addr+"</h1>");
		out.println("<h1>사용중인 소프트웨어 </h1> ");
		for(int i=0; i<sw.length; i++){
			out.println("<h3>"+sw[i]+"</h3>");
		}
		out.println("</body>");
		out.println("</html>");
	}

}

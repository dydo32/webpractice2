package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		//System.out.println("���� ��û ����");	
	
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		String id = req.getParameter("userId");
		String name = req.getParameter("userName");
		String pass = req.getParameter("passwd");
/*		System.out.println("���̵�: "+ id);
		System.out.println("����: "+ name);
		System.out.println("�н�����: "+ pass);*/
		
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] item = req.getParameterValues("item");
/*		System.out.println("����: "+ gender);
		System.out.println("����: "+ job);
		System.out.println("�����ϴ°�: "+ item);*/
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>customer</h1>");
		out.println("<p>-------------------</P>");
		out.println("<h3>���̵�: "+id+"</h3>");
		out.println("<h3>����: "+name+"</h3>");
		out.println("<h3>�н�����: "+pass+"</h3>");
		out.println("<h3>����: "+gender+"</h3>");
		out.println("<h3>job: "+job+"</h3>");
		out.println("<h3>Favorites: ");
		for (int i = 0; i < item.length; i++) {
			out.print(item[i]+" ");
		}
		out.println("</h3>");
		out.println("</body>");
		out.println("</html>");
	}
}

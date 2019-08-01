package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		//System.out.println("���� ��û ����");	
		
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		String[] language = req.getParameterValues("language");
		String save = req.getParameter("save");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2> client form data ó�� </h2>");

		out.println("<ul>");
		out.println("<li>�̸�: ");
		if(name.equals("")){
			out.println("<�̸��� �Է��ϼ���></li>");
		}else{
			out.println(name+"</li>");
		}
		
		out.println("<li>�ּ�: ");
		if(addr.equals("")){
			out.println("<�ּ��� �Է��ϼ���></li>");
		}else{
			out.println(addr+"</li>");
		}
		
		out.println("��밡���� Language ����. <br/>");
		if(language==null){
			out.println("<li>��� ������ language�� �����ϴ�</li>");
		}else{
			for(int i=0; i<language.length; i++){
				out.print("<li>"+language[i]+"</li>");
			}
		}
		
		out.println("<li>�Է� ���� ��������:");
		if(save==null){
			out.println("�Է����� ���������� �����ϼ���</li>");
		}else{
			out.println(save+"</li>");
		}
		
		out.println("</ul>");
		
		out.println("</body>");
		out.println("</html>");

	}
}

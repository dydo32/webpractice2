package emp.controller.recode;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.service.EmpService;
import emp.service.EmpServiceImpl;

public class EmpDeleteServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		//System.out.println("���� ��û ����");
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//1. ��û���� ����
		String id = req.getParameter("id");
		//System.out.println(id);
		//2. �����Ͻ� �޼ҵ� ȣ��
		EmpService service = new EmpServiceImpl();
		int result = service.delete(id);
		
		out.println("<html>");
		out.println("<body>");
		if(result>=1){
			out.println("<h1>"+result+"�����������!!</h1>");
		}else{
			out.println("<h1>��������</h1>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}

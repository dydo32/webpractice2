package emp.controller.recode;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;
import emp.service.EmpServiceImpl;

public class EmpInsertServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// System.out.println("���� ��û ����");

		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//1. Ŭ���̾�Ʈ�� ��û���� ����
		String deptno = req.getParameter("deptno");//�μ���ȣ
		String name = req.getParameter("name"); //����
		String id = req.getParameter("id");//���
		String pass = req.getParameter("pass"); //�н�����
		String addr = req.getParameter("addr");//�ּ�
		int point = Integer.parseInt(req.getParameter("point")); //����Ʈ
		String grade = req.getParameter("grade"); //���
		
		//2. �����Ͻ� �޼ҵ� ȣ��
		EmpService service = new EmpServiceImpl();
		EmpDTO user = new EmpDTO(id, pass, name, addr, grade, point, deptno);
		/*	user.setDeptno(deptno);
		user.setName(name);
		user.setId(id);
		user.setPass(pass);
		user.setAddr(addr);
		user.setPoint(point);
		user.setGrade(grade);*/
		int result = service.insert(user);
		
		//3. ����ȭ���� ����
		String msg = "";
		if(result>=1){
				msg = result+"�� �� ���� ����";
		}else{
			msg = "���Խ���";
		}
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>"+msg+"</h1>");
		out.println("<a href='/serverweb/emp/list.do'>ȸ����Ϻ���</a>");
		/*if(result==0){	
			out.println("<h1>���Խ���</h1>");
			out.println("<h2>���Խ���</h2>");
		}else{
			out.println("<h1>���Լ���</h1>");
			out.println("<h2>1���� �� ���� ����</h2>");
		}*/
		out.println("</body>");
		out.println("</html>");		
	}
}

package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		//System.out.println("������ ��û ����");
		
		//ó���� ���� �⺻ �۾� - �ѱۼ���, ���䰴ü�� ���� ��Ʈ���� ���, ���信 ���� Ÿ���� ����
		req.setCharacterEncoding("euc-kr");
		res.setContentType("text/html;charset=euc-kr");
		PrintWriter out = res.getWriter();
		
		//��û��������
		int num1 = Integer.parseInt(req.getParameter("num1"));
		String opr = req.getParameter("method");
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		//�����Ͻ����� ȣ��
		Calc obj = new Calc();
		int result = obj.calc(num1, num2, opr);
		
		//Ŭ���̾�Ʈ�� ������ ȭ���� ����
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>�����("+opr+"��������)"+"</h1>");
		out.println("<hr/>");
		out.println("<h3>num1�� "+num1+"�� num2��"+ num2 +"��</h3>");
		out.println("<h3>������ ����� "+result+"�Դϴ�.</h3>");
		out.println("</body>");
		out.println("</html>");

	}
}
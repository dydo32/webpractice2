package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTestServlet extends HttpServlet{

	public LifeCycleTestServlet() {
		System.out.println("LifeCycleTestServlet��ü ����");
	}
	
	public void init(){
		System.out.println("init()..ȣ��");
	}
	
	//HttpServletRequest,HttpServletResponse-�Ű����������ٲ��ȵ�
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("service()^^..ȣ��");
		//get������� ��û�� ������ doGet�� ȣ���ϰ� post����̸� doPost�� ȣ��
		//System.out.println(req.getMethod());
		if(req.getMethod().equals("GET")){
			doGet(req,res);
		}else{
			doPost(req, res);
		}
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet()..ȣ��");
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost()..ȣ��");
	}

	public void destroy(){
		//������ü�� �Ҹ�ɶ� ȣ��Ǵ� �޼ҵ�
		// - WAS�� ���ε�, ������ ����Ǿ��� ��, Context�� ���ε�� ��
		System.out.println("destroy()..ȣ��");
	}
	

}

package fw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static void main(String[] args){
		System.out.println(getConnect());
	}
	static {	//����̹��ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnect(){ //DB���� ����
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//�ڿ��ݳ�
	public static void close(ResultSet rs, Statement stmt, Connection con){
		try{
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (con != null) con.close();		
			}catch(SQLException e){
				e.printStackTrace();
			}
	}
	
	//Connection�ݳ�
	public static void close(Connection con){
		try{
			if (con != null) con.close();		
			}catch(SQLException e){
				e.printStackTrace();
			}
	}
	//Statement�ݳ�
	public static void close(Statement stmt){
		try{
			if (stmt != null) stmt.close();	
			}catch(SQLException e){
				e.printStackTrace();
			}
	}
	//ResultSet�ݳ�
	public static void close(ResultSet rs){
		try{
			if (rs != null) rs.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
	}
}

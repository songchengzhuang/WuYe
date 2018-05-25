package tsu.pro.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * @类名: mysqlconnection
 * @描述:用户权限查询时用到
 * @作者: lhs
 * @日期 2018年4月10日 上午8:51:21
 * @修改人:
 * @修改时间:
 */
public   abstract class   mysqlconnection {
 static{
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
    public ResultSet resultset;
    public PreparedStatement stat;
    public static Connection connection;
	public final static String url="jdbc:mysql://127.0.0.1:3306/pro_server?useUnicode=true&characterEncoding=utf-8";
	public final static String user="root";
	public final static String password="scz123";
	static{
	try {
		connection=DriverManager.getConnection(url, user, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
		

	
	
	
	public static void killCountion(Connection conn,Statement statement,ResultSet rs){  
		   try {
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

package dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import bean.LoginBean;

public class LoginDao {
   public static boolean login(LoginBean lb) {
	   boolean status=false;
	   try {
		 Class.forName("com.mysql.jdbc.Driver");
		Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mysql");
		PreparedStatement ps=(PreparedStatement) conn.prepareStatement("select * from curdstruts where email=? and pass=?");
		ps.setNString(1, lb.getEmail());
		ps.setString(2,lb.getPass());
		ResultSet rs=ps.executeQuery();
		status=rs.next();
	} catch (Exception e) {
		// TODO: handle exception
	}
	   return status;
   }
}

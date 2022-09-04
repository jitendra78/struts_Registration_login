package dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import bean.RegistrationBean;

public class RegistrationDao {
  public static boolean save(RegistrationBean rb) {
	  boolean status=false;
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mysql");
		  PreparedStatement psmt=(PreparedStatement) conn.prepareStatement("insert into curdstruts values(?,?,?,?,?,?,?)");
		  psmt.setInt(1, rb.getId());
		  psmt.setString(2, rb.getName());
		  psmt.setString(3, rb.getEmail());
		  psmt.setString(4, rb.getPass());
		  psmt.setLong(5, rb.getMob_no());
		  psmt.setString(6, rb.getGender());
		  psmt.setString(7, rb.getAddress());
		  status=psmt.execute();
	} catch (Exception e) {
		// TODO: handle exception
	}
	  return status;
  }
}

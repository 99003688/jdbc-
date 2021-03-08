package demodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prepared {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		PreparedStatement p= c.prepareStatement("select * from customer");
		ResultSet rs= p.executeQuery();
		System.out.println("its prepeared statement");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+ rs.getString(3)+" ");
		}
		

	}

}

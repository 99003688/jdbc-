import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	//	Class.forName("com.mysql.cj.jdbc.Driver");
	 	 Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		 Statement s= c.createStatement();
		 
		 ResultSet re= s.executeQuery("select * from customer");
		 while(re.next()) {
			 System.out.println(re.getInt(1)+" "+ re.getString(2)+" "+ re.getString(3)+" ");
		 }
		 
		 c.close();
	}

}

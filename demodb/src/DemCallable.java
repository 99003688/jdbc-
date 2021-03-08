import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemCallable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		
		CallableStatement cs= c.prepareCall("{}") ;
	}

}

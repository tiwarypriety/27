package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnection implements Connection1{

	@Override
	public Connection getConnection() {
	Connection con = null;
		try{
			
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			con = DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198:1521:orcl","sh","sh");
		}catch(Exception e){
			
		}
return con;
}
}

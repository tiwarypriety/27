package jdbc;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args)
	{
		Connection connection;
		Connection1 c=new OracleConnection();
		connection = c.getConnection();
		if(connection!=null)
		{
			System.out.println("Connection Established");
		}

		}	
	}



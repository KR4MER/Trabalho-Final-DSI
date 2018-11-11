package contas.connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
		String url="jdbc:mysql://localhost/ds1financas?useSSL=false&useTimezone=true&serverTimezone=UTC";
		String userName="root";
		String userPassword="root";
		
		try {

			return DriverManager.getConnection(url,userName,userPassword);
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e.getMessage());
			
		}
		
	}

}

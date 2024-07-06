import java.sql.*;

public class Main {

	public static void main(String[] args) {

		try(Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE","system","admin")){
			
			if(conn!=null) {
				System.out.println("conexão realizada com sucsso!");
				
			} else {
				System.out.println("Falha na conexão!");
			}
			
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

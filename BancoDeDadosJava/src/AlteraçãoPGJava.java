import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AlteraçãoPGJava {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "Gallade#475";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String instrucaoUpdate = "UPDATE aluno SET name =?, age=? WHERE ID=?";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoUpdate);
			preparedStatement.setString(1, "Carla");
			preparedStatement.setInt(2, 30);
			preparedStatement.setInt(3, 1);
			
			preparedStatement.executeUpdate();
			
			System.out.println("Alteração realizada com sucesso");
			
			
		}catch(Exception exception){
			exception.printStackTrace();
			
		}

	}

}

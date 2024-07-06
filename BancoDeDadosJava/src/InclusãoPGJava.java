import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InclusãoPGJava {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "Gallade#475";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String instrucaoInsert = "INSERT INTO aluno(id, name, age) VALUES(?,?,?)";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoInsert);
			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "Meire");
			preparedStatement.setInt(3, 51);
			
			preparedStatement.executeUpdate();
			
			System.out.println("Inclusão realizada com sucesso");
			
			
		}catch(Exception exception){
			exception.printStackTrace();
			
		}

	}

}

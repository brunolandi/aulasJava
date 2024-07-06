import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeletePGJava {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "Gallade#475";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String instrucaoDelete = "DELETE FROM aluno WHERE id = ?";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoDelete);

			preparedStatement.setInt(1, 4);

			preparedStatement.executeUpdate();
				
			System.out.println("Exclusão realizada com sucesso");
			
		
		}catch(Exception exception){
			exception.printStackTrace();
			
		}

	}

}
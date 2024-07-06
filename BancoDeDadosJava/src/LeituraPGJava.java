import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LeituraPGJava {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "Gallade#475";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String instrucaoSelect = "SELECT * FROM aluno";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement preparedStatement = conexao.prepareStatement(instrucaoSelect);

			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next()){
				int id = rs.getInt("id");
				String nome = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("Id: " + id +" - Nome: " + nome + " - Idade: " + age);
				
			}
					
			System.out.println("Leitura realizada com sucesso");
			
			
		}catch(Exception exception){
			exception.printStackTrace();
			
		}

	}

}

import java.sql.*;

public class Main2Teste {

	public static void main(String[] args) {

		final String usuario = "postgres";
		final String senha = "Gallade#475";
		final String url = "jdbc:postgresql://localhost:5432/postgres";
		final String instrucaoSelect = "SELECT * FROM aluno";
		final String driverBanco = "org.postgresql.Driver";
		
		try {
			
			Class.forName(driverBanco);
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			
			Statement setenca = conexao.createStatement();
			ResultSet rs = setenca.executeQuery(instrucaoSelect);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("Id: " + id + " - Nome: " + name + " - Idade: " + age);
				
			}
			
			System.out.println("Conexão realizada com sucesso");
		}catch(Exception exception){
			System.out.println("Erro na conexão com Banco de Dados");
			
		}

	}

}


public class Main {

	public static void main(String[] args) {

		try {
			throw new ExcecaoCustom("Minha Exceção");
			
		}catch(ExcecaoCustom excecaoCustmon) {
			System.out.println("Ocorreu uma exceção");
			System.out.println(excecaoCustmon.getMessage());
			
		}

	}

}

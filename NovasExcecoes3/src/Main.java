
public class Main {

	public static void main(String[] args) {

		try {
			throw new ExcecaoCustom("Minha Exceção");
		}catch(ExcecaoCustom e) {
			System.out.println(e);

		}

	}

}

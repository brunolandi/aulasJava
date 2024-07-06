
public class ExcecaoCustom extends Exception{
	String mensagem;
	
	ExcecaoCustom(String str){
		mensagem = str;
			
	}
	
	public String toString() {
		return("Exceção customizada : " + mensagem);
	}
	
}


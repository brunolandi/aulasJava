import java.util.TreeMap;
import java.util.Map;


public class ExProfArvoreMapa {

	public static void main(String[] args) {

		Map<String, String> mapaNomes = new TreeMap<String, String>();
		mapaNomes.put("Mari", "Marianna");
		mapaNomes.put("Ro", "Rodrigo");
		mapaNomes.put("Bru", "Bruno");
		mapaNomes.put("Gigi", "Giovana");
		
		System.out.println("TreeMap de Nomes: " + mapaNomes);
		
		System.out.println("Chaves " + mapaNomes.keySet());
		System.out.println("Valores " + mapaNomes.values());
		System.out.println("Chave/Valor " + mapaNomes.entrySet());
		

	}

}

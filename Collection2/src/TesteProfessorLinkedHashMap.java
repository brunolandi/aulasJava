import java.util.LinkedHashMap;

public class TesteProfessorLinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap<String, String> listaNomes = new LinkedHashMap<String, String>();
		listaNomes.put("Mari", "Marianna");
		listaNomes.put("Ro", "Rodrigo");
		listaNomes.put("Bru", "Bruno");
		listaNomes.put("Gigi", "Giovana");
		
		System.out.println("LinkedHashMap: " + listaNomes);
		
		LinkedHashMap<String, String> novaListaNomes = new LinkedHashMap<String, String>(listaNomes);
		novaListaNomes.put("Teqs", "Tequila");
		System.out.println("LinkedHashMap Att: " + novaListaNomes);

	}

}

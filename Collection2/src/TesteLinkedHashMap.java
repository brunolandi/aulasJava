import java.util.LinkedHashMap;
import java.util.Map;

public class TesteLinkedHashMap {

	public static void main(String[] args) {

		Map<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(12, "Maria");
		lmap.put(5, "Nicole");
		lmap.put(23, "Samuel");
		lmap.put(9, "Sonia");
		System.out.println("LHashMap antes da modificação: " + lmap);
		System.out.println("Funcinario ID 12 exists: " + lmap.containsKey(12));
		System.out.println("Funcionario Andre exists: " + lmap.containsValue("Andre"));
		System.out.println("Numero total de funcionários: " + lmap.size());
		System.out.println("Removendo Func ID 5: " + lmap.remove(5));
		System.out.println("Removendo Func ID 3 (não existente): " + lmap.remove(3));
		System.out.println("LHashMap após modificação: " + lmap);
	

	}

}

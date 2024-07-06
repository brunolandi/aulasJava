import java.util.TreeMap;

public class ArvoreMapa {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		
		tmap.put(1, "João");
		tmap.put(23, "Maria");
		tmap.put(70, "Jorge");
		tmap.put(4, "Eduardo");
		tmap.put(2, "Valentina");
		
		System.out.println(tmap);
		

	}

}

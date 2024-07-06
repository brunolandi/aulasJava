
public class Principal {

	public static void main(String[] args) {

		Cachorro cachorro[] = new Cachorro[3];

		cachorro[0] = new Cachorro();
		cachorro[1] = new Cachorro();
		cachorro[2] = new Cachorro();


		
		cachorro[0].setName("Bisna");
		cachorro[0].setColor("Marrom");
		cachorro[0].setAge(5);
		cachorro[0].setGender("Macho");
		cachorro[0].setPedigre(true);
		cachorro[0].setPeso(5.5);
		cachorro[0].setRace("Shitzu");
		
        System.out.println(cachorro[0].getName());
		
		cachorro[1].setName("Fofinha");
		cachorro[1].setColor("Branco");
		cachorro[1].setAge(3);
		cachorro[1].setGender("Femea");
		cachorro[1].setPedigre(false);
		cachorro[1].setPeso(25.5);
		cachorro[1].setRace("Pitbull");				
		
        System.out.println(cachorro[1].getName());
        cachorro[1].correr();

	}

}

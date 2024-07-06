
public class Principal2 {

	public static void main(String[] args) {

		String space = "---------------------------------";
			
		Cachorro dog1 = new Cachorro();
		Cachorro dog2 = new Cachorro();
		
		
		dog1.setName("Bisna");
		dog1.setColor("Marrom");
		dog1.setAge(5);
		dog1.setGender("Macho");
		dog1.setPedigre(true);
		dog1.setPeso(5.5);
		dog1.setRace("Shitzu");
		
		System.out.println(space);
        System.out.println("Nome do cachorro: " + dog1.getName());
        System.out.println("Idade do cachorro: " + dog1.getAge() + " Anos");
        System.out.println("Genero do cachorro: " + dog1.getGender());
        System.out.println("Cor do cachorro: " + dog1.getColor());
        System.out.println("Peso do cachorro: " + dog1.getPeso() + " Kilos");
        System.out.println("Raça do cachorro: " + dog1.getRace());
        if(dog1.pedigre==true)
        
        	System.out.println("Pedigre do cachorro: Possui");
        		else 
        			System.out.println("Pedigre do cachorro: Não Possui");
        
        
        
        
        
        
		dog2.setName("Fofinha");
		dog2.setColor("Branco");
		dog2.setAge(7);
		dog2.setGender("Femea");
		dog2.setPedigre(false);
		dog2.setPeso(27.95);
		dog2.setRace("Pitbull");
		
		System.out.println(space);
        System.out.println("Nome do cachorro: " + dog2.getName());
        System.out.println("Idade do cachorro: " + dog2.getAge() + " Anos");
        System.out.println("Genero do cachorro: " + dog2.getGender());
        System.out.println("Cor do cachorro: " + dog2.getColor());
        System.out.println("Peso do cachorro: " + dog2.getPeso() + " Kilos");
        System.out.println("Raça do cachorro: " + dog2.getRace());
        if(dog2.pedigre==true)
        
        	System.out.println("Pedigre do cachorro: Possui");
        		else 
        			System.out.println("Pedigre do cachorro: Não Possui");
        
        	
        	
        }
        
        
        


	}



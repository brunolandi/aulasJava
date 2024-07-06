
public class Cachorro {
	
	public String name, gender, race, color;
	public int age;
	public double peso;
	public boolean pedigre;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isPedigre() {
		return pedigre;
	}
	public void setPedigre(boolean pedigre) {
		this.pedigre = pedigre;
	}
	
	
	public void correr() {
		System.out.println("Estou correndo");
	}
	
	
	

}

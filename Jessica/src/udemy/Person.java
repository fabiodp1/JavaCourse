package udemy;

public class Person {

	private String firstName;
	private String secondName;
	private int age;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
		if (this.age < 0 || this.age > 100) {
			
			this.age = 0;
		}
	}
	
	public static void main(String[] args) {
		
		Person primaPersona = new Person();
		primaPersona.setFirstName("Jack");
		primaPersona.setSecondName("Masaico");
		primaPersona.setAge(110);
		
		Person secondaPersona = new Person();
		secondaPersona.setFirstName("Aurora");
		secondaPersona.setAge(15);
		
		Person terzaPersona = new Person();
		terzaPersona.setSecondName("Sussurri");
		terzaPersona.setAge(50);
		
		Person quartaPersona = new Person();		
		quartaPersona.setFirstName("Fulvio");
		quartaPersona.setSecondName("Bramanti");
		quartaPersona.setAge(-10);
	
		
		System.out.println("La prima persona si chiama: " + primaPersona.getFullName());
		System.out.println("La sua età è: " + primaPersona.getAge());
		System.out.println("La seconda persona si chiama: " + secondaPersona.getFullName());
		System.out.println("La sua età è: " + secondaPersona.getAge());
		System.out.println("La terza persona si chiama: " + terzaPersona.getFullName());
		System.out.println("La sua età è: " + terzaPersona.getAge());
		System.out.println("La quarta persona si chiama: " + quartaPersona.getFullName());
		System.out.println("La sua età è: " + quartaPersona.getAge());
		
		
	}
	
	public boolean isTeen() {
		
		if (age > 12 && age < 20) {
			
			return true;
		} else {
			
			return false;
		}
	}
	
	public String getFullName() {
		
		
		if (firstName == null || firstName.isEmpty()) {
			
			return secondName;
			
		}else if(secondName == null || secondName.isEmpty()) {
			
			return firstName;
			
		}else {
			
			return firstName + " " + secondName;
		}
		
	}
	
	
}

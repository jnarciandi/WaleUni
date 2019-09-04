import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {
	
	public String name;
	public int age;
	public LocalDate birth;
	public double weigth;
	public double heigth;
	
	//Constructors
	
	public Person (String name, double weigth, double heigth, int year, int month, int day) {
		this.name = name;	
		this.birth = LocalDate.of(year, month, day);
		Period timePast = this.birth.until(LocalDate.now());
		this.age = timePast.getYears();
		this.weigth = weigth;
		this.heigth = heigth;
	}
	public Person (String name,int year, int month, int day) {
		this(name,0.0,0.0,year,month,day);
	}
	
	
	//My Methods
	
	//Check the Adulthood
	public boolean isAdult() {
		if (this.age> 17) {
			return true;
		}else {
			return false;
		}
	}
	
	

	public void printPerson() {
		System.out.println(toString());
	}
	//We don't use becomeOlder because our age is defined by the birth date. We only can check it if it has to age.
	/*public void becomeOlder() {
		this.age++;
		this.printPerson();
	}*/
	
	public void checkAge() {
		Period timePast = this.birth.until(LocalDate.now());
		this.setAge(timePast.getYears());
	}
	
	// We can get fat by one kilo or the amount we write
	public void goneFat() {
		this.weigth++;
		this.printPerson();
	}
	
	public void goneFat(double fat) {
		this.weigth = this.weigth + fat;
		this.printPerson();
	}
	//this calculates de IMC
	public double bodyMassIndex() {
		double imc = this.weigth / (Math.pow(this.heigth, 2));
		return imc;
	}
	//The limit height in Dragon Khan is 1.40, can this person ride it?
	public boolean canDragonKhan() {
		if (this.heigth > 1.40) {
			return true;
		}else {
			return false;
		}
	}
	
	
	// Basic Methods from IDE
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	public LocalDate getBirth() {
		return birth;
	}

	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth + "]";
	}
		
}


import java.util.ArrayList;

public class Student extends Person{
	
	private ArrayList<Pet> pets;
	private Apartment apartment;
	private ArrayList<Subject> subjects;
	private Card card;
	
	public Student (String name, double weigth, double heigth, int year, int month, int day, String adress) {
		super(name, weigth, heigth,year,month,day);
		this.pets = new ArrayList<Pet>();
		this.apartment = new Apartment(adress);
		this.subjects = new ArrayList<Subject>();
		
	}
	
	public Student (String name, int year, int month, int day, String adress) {
		super(name,year,month,day);
		this.pets = new ArrayList<Pet>();
		this.apartment = new Apartment(adress);
		this.subjects = new ArrayList<Subject>();
		
	}

	
	
	
	//Getters and Setters
	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}

	public Apartment getApartment() {
		return apartment;
	}

	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {		
		return super.toString() +"Student [pets=" + pets + ", apartment=" + apartment + ", subjects=" + subjects + ", card=" + card + "]";
	}

}

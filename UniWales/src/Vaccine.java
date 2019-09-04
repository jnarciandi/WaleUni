import java.time.LocalDate;
import java.time.Period;


public class Vaccine {
	
	private String name;
	private LocalDate putDate;	
	boolean repeatable;
	private LocalDate expirationDate;
	boolean mandatory;
	
	// We can create a Vaccine Object with one date for a non- repeatable (more than one dosis) one.
	// If we put a second date a repeatable object is created.
	
	public Vaccine (String name, int year, int month, int day, boolean mandatory) {
		this.name = name;
		this.putDate = LocalDate.of(year, month, day);		
		this.mandatory = mandatory;
		this.repeatable = false;
	}
	public Vaccine (String name, int year, int month, int day, boolean mandatory, int eYear, int eMonth, int eDay) {
		this.name = name;
		this.putDate = LocalDate.of(year, month, day);		
		this.mandatory = mandatory;
		this.repeatable = true;
		this.expirationDate = LocalDate.of(eYear, eMonth, eDay);
	}
	
	//Methods
	
	//revisionTime calculates how many time lasts for the next dosis of the Vaccine.
	
	public Period revisionTime() {
		if (this.repeatable) {
			if (this.expirationDate.isAfter(LocalDate.now())) {
				return LocalDate.now().until(this.expirationDate);
			}else {
				System.out.println("Your expiration day have been past. Contact Veterinarian immediatly");
				return null;
			}
			
		}else {
			System.out.println("This vaccine don't need more dosis.");
			return null;
		}
	}
	
	public boolean controlExpiration() {
		if (this.repeatable) {
			if (this.expirationDate.isAfter(LocalDate.now())) {
				return true;
			}else {
				System.out.println("Your expiration day have been past. Contact Veterinarian immediatly");
				return false;
			}
		}else {
			System.out.println("This vaccine don't need more dosis.");
			return false;
		}
	}
	
	
	
	
	
	
	
	//Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getPutDate() {
		return putDate;
	}
	public void setPutDate(LocalDate putDate) {
		this.putDate = putDate;
	}
	public boolean isRepeatable() {
		return repeatable;
	}
	public void setRepeatable(boolean repeatable) {
		this.repeatable = repeatable;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	public boolean isMandatory() {
		return mandatory;
	}
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	@Override
	public String toString() {
		return "Vaccine [name=" + name + ", putDate=" + putDate + ", repeatable=" + repeatable + ", expirationDate="
				+ expirationDate + ", mandatory=" + mandatory + "]";
	}
	
	
}

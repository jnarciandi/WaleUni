import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Pet {
	
	private String name;
	private String type;
	private String race;
	private LocalDate birth;
	private ArrayList<Vaccine> Vaccines;
	
	
	public Pet (String name, String type, String race, int year, int month, int day) {
		this.name = name;
		this.type = type;
		this.race = race;
		this.birth = LocalDate.of(year,month,day);
		this.Vaccines = new ArrayList<Vaccine>();		
	}
	public Pet (String name, String type, int year, int month, int day) {
		this.name = name;
		this.type = type;
		this.race = ("Unknown");
		this.birth = LocalDate.of(year,month,day);
		this.Vaccines = new ArrayList<Vaccine>();		
	}
	
	public int getAge() {
		Period timePast = this.birth.until(LocalDate.now());
		return timePast.getYears();
	}
	
	public void addVaccine(Vaccine vaccine) {
		this.Vaccines.add(vaccine);
		}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public LocalDate getBirth() {
		return birth;
	}
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	public ArrayList<Vaccine> getVaccines() {
		return Vaccines;
	}
	public void setVaccines(ArrayList<Vaccine> vaccines) {
		Vaccines = vaccines;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", type=" + type + ", race=" + race + ", birth=" + birth + ", Vaccines=" + Vaccines
				+ "]";
	}

}

import java.time.LocalDate;
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

}

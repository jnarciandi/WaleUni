

public class Main {
	public static void main(String[] args) {
		
		//vamos a crear 2 students:
		
		Person ted = new Student("Ted pelican",82.5,1.85,1981,2,23,"Calle Bogavante 31");
		System.out.println(ted.toString());
		Person yajaira = new Student("Yajaira Ania", 1985,6,18,"Calle Contranquil 23");
		System.out.println(yajaira.toString());
		
		// les adjudicamos una mascota a cada uno.
		
		ted.addPet(new Pet("Yuyo", "gato", "siamés",2014,5,9));
		System.out.println(ted.);
		
		
		
		/*
		 * Vaccine a1 = new Vaccine("tuber", 2016, 12, 23, true, 2020, 5, 3);
		 * System.out.println(a1.revisionTime()); Person p1 = new
		 * Student("pepe",80.2,1.87,1980,1,21,"Calle Villarroel 157"); //Person p2 = new
		 * Person("pepe",80.2,1.87,1980,1,21); System.out.println(p1.getAge());
		 * System.out.println(p1.getBirth()); //Person e1 = p1;
		 * //System.out.println(((Student) e1).getApartment().getAdress());
		 * System.out.println(p1.getApartment().getAdress());
		 * //System.out.println(p2.getApartment().getAdress());
		 * System.out.println(p1.getAdress());
		 * 
		 * //p1.getApartment().larger(otherApartment);
		 */
	}

}

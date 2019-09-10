

public class Main {
	public static void main(String[] args) {
		
		//vamos a crear 2 students:
		
		Person ted = new Student("Ted pelican",82.5,1.85,1981,2,23,"Calle Bogavante 31");
		System.out.println(ted.toString());
		Person yajaira = new Student("Yajaira Ania", 1985,6,18,"Calle Contranquil 23");
		System.out.println(yajaira.toString());
		
		// les adjudicamos una mascota a cada uno.
		
		ted.addPet(new Pet("Yuyo", "gato", "siamés",2014,5,9));
		System.out.println(ted.getPets().get(0).toString());
		yajaira.addPet(new Pet("Camiso", "Iguana", 2018,3,4));
		System.out.println(yajaira.getPets().get(0).toString());
		
		// vacunemos 2 veces a Yuyo
		
		ted.getPets().get(0).addVaccine(new Vaccine("Rabia", 2014,10,12,true));
		ted.getPets().get(0).addVaccine(new Vaccine("Tetanos", 2016,5,9,false,2020,6,8));
		System.out.println(ted.getPets().get(0).getVaccines().get(0).toString());
		System.out.println(ted.getPets().get(0).getVaccines().get(0).revisionTime());
		System.out.println(ted.getPets().get(0).getVaccines().get(1).toString());
		System.out.println(ted.getPets().get(0).getVaccines().get(1).revisionTime());
		
		// ted have a Debit Card and Yajaira a Credit one.
		
		ted.setCard(new Debit(1241222, 200.30));
		System.out.println(ted.getCard());
		ted.getCard().pay(20.0);
		System.out.println(ted.getCard());
		
		yajaira.setCard(new Credit(14455566, 15.00));
		System.out.println(yajaira.getCard());
		yajaira.getCard().pay(23.0);
		System.out.println(yajaira.getCard());
		
		
		// Ted have 3 subjects and an average score.
		
		ted.getSubjects().add(new Subject("Math", 6.5, 7));
		ted.getSubjects().add(new Subject("English", 8.0, 5));
		ted.getSubjects().add(new Subject("Anatomy", 4.9, 8));
		System.out.println("The average score is:" + ted.subjectsAverage());
		
	}

}

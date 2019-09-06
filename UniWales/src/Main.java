

public class Main {
	public static void main(String[] args) {
		Vaccine a1 = new Vaccine("tuber", 2016, 12, 23, true, 2020, 5, 3);
		System.out.println(a1.revisionTime());
		Person p1 = new Student("pepe",80.2,1.87,1980,1,21,"Calle Villarroel 157");
		//Person p2 = new Person("pepe",80.2,1.87,1980,1,21);
		System.out.println(p1.getAge());
		System.out.println(p1.getBirth());
		//Person e1 = p1;
		//System.out.println(((Student) e1).getApartment().getAdress());
		System.out.println(p1.getApartment().getAdress());
		//System.out.println(p2.getApartment().getAdress());
		System.out.println(p1.getAdress());

		//p1.getApartment().larger(otherApartment);

	}

}

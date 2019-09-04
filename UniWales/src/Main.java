

public class Main {
	public static void main(String[] args) {
		Vaccine a1 = new Vaccine("tuber", 2016, 12, 23, true, 2020, 5, 3);
		System.out.println(a1.revisionTime());
		Person p1 = new Student("pepe",80.2,1.87,1980,1,21,"Calle Villarroel 157");
		System.out.println(p1.getAge());
		System.out.println(p1.getBirth());
		System.out.println(((Student) p1).getApartment().getAdress());

	}

}


public class Subject {
	String name;
	double score;
	int modulos;
	
	
	public Subject (String name, double score, int mod){
		this.name = name;
		this.score = score;
		this.modulos = mod;
			
	}

	
	
	
	
	
// Getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		this.score = score;
	}


	public int getModulos() {
		return modulos;
	}


	public void setModulos(int modulos) {
		this.modulos = modulos;
	}


	@Override
	public String toString() {
		return "Subject [name=" + name + ", score=" + score + ", modulos=" + modulos + "]";
	}
	
	
	
	
	
	

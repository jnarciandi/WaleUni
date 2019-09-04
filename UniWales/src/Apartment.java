
public class Apartment {
	
	private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private String adress;
    
    public Apartment(String adress) {
    	this.adress= adress;
    	this.rooms = 0;
    	this.squareMeters = 0;
    	this.pricePerSquareMeter = 0;
    			
    }

    /*public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }*/
    
    public boolean larger(Apartment otherApartment){
        if (this.squareMeters > otherApartment.squareMeters){
            return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment){
        if (this.price() > otherApartment.price()){
            return (this.price() - otherApartment.price());
        }else{
            return (otherApartment.price() - this.price());
        }
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        if (this.price() > otherApartment.price()){
            return true;
        }else{
            return false;
        }        
    }
    
    public int price(){
        return (this.pricePerSquareMeter * this.squareMeters);
    }

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(int squareMeters) {
		this.squareMeters = squareMeters;
	}

	public int getPricePerSquareMeter() {
		return pricePerSquareMeter;
	}

	public void setPricePerSquareMeter(int pricePerSquareMeter) {
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}

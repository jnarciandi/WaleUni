
public abstract class Card {
	
	private int cardNumber;
	
	public Card (int number) {
		this.cardNumber = number;
	}
	
	//abstract methods
	public abstract double balance();
	
	public abstract void loadMoney(double amount);
	
	public abstract boolean pay(double amount);

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "Card [cardNumber=" + cardNumber + "]";
	}

}

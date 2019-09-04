
public class Debit extends Card {
	private double balance;

    public Debit(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
        this.balance += amount;
    }
    
    //The method 'pay' check if there are enough funds and pay and return a 
    // boolean checking the action.
    public boolean pay(double amount) {
        if (this.balance < amount){
            return false;
        }else{
            this.balance -= amount;
            return true;
        }           
    }

}

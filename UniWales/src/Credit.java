

// CLASE SOLO MALCOPIADA!!!!
public class Credit extends Card {
	private double balance;
    //Added debt atribute and its basic methods:
    private double debt;
 
    public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public Credit(String owner, double balance) {
        this.balance = balance;
        this.debt = 0.0;
    }
 
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void debtIncrease(double amount) {
    	double interest = (amount * 5.0) / 100.0;
    	debt += amount +  interest;
    }
    
    public void payDebt(double amount) {
    	debt -= amount;
    }
 
    public void withdrawal(double amount) {
        balance -= amount;
    }
 
    public double getBalance() {
        return balance;
    }
    
    public boolean confirmFunds(double amount) {
    	if (this.balance < amount) {
    		return false;
    	}else {
    		return true;
    	}
    }
 
    public String getOwner() {
		return owner;
	}

    public void setOwner(String owner) {
		this.owner = owner;
	}

    public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + ", owner=" + owner + ", debt=" + debt + "]";
	}
}

}

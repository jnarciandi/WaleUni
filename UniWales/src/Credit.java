


public class Credit extends Card {
	
	
	private double balance;
	private double debt;
	private double maxCredit;

    public Credit(int number,double balance) {
    	super(number);
        this.balance = balance;
        this.debt = 0;
        this.maxCredit = 100;
    }

    public double balance() {
        return this.balance;
    }

    public void loadMoney(double amount) {
    	if(this.debt == 0.0) {
    		this.balance += amount;
    	}else if(this.debt > amount) {
    		this.debt = this.debt-amount;
    	}else if(this.debt < amount) {
    		amount = amount - this.debt;
    		this.debt = 0.0;
    		this.balance = this.balance + amount;
    	}
        
    }
    
    //The method 'pay' check if there are enough funds and pay and return a 
    // boolean checking the action.
    public boolean pay(double amount) {
        if (this.balance < amount && amount > this.maxCredit - this.debt){        	
            return false;
        }else if(this.balance < amount && amount <= this.maxCredit - this.debt){
        	amount = amount -this.balance;
        	this.balance = 0;
        	this.debt= amount;
        	return true;
            
        }else{
            this.balance -= amount;
            return true;
        }           
    }

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDebt() {
		return debt;
	}

	public void setDebt(double debt) {
		this.debt = debt;
	}

	public double getMaxCredit() {
		return maxCredit;
	}

	public void setMaxCredit(double maxCredit) {
		this.maxCredit = maxCredit;
	}

	@Override
	public String toString() {
		return super.toString() + "Credit [balance=" + balance + ", debt=" + debt + ", maxCredit=" + maxCredit + "]";
	}

}

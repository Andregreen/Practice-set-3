package code;

public class Account {
	private int id;
	
	private double balance;
	
	private double annualInterestRate;
	
	private String dateCreated;
	
	public Account(){
		
	}
	public int getID(){
		return(id);
	}
	public double getBalance(){
		return (balance);
	}
	public double getAnnualInterestRate(){
		return(annualInterestRate);
	}
	public String getDateCreated(){
		return(dateCreated);
		
	}
	public void setId(int id){
		this.id=id;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void setAnnualInterestRate(int annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}
	public double getMonthlyInterestRate(){
		double interestrate=annualInterestRate/100;
		double monthlyInterestRate=interestrate/12;
		return monthlyInterestRate;
	}
	public void withdraw(double amount){
		if (balance>=amount){
			balance-=amount;
			}
		else{
			System.out.print("Insufficent funds");
			balance+=0;
		}
	}
	public void deposit(double amount){
		balance+=amount;
	}
}
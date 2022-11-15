package entities;

public class BankAccount {

	private String name;
	private int idAccount;
	private double totalAmount;

	public BankAccount(String name, int idAccount, double initialDeposit) {

		this.name = name;
		this.idAccount = idAccount;
		deposit(initialDeposit);//mesma coisa que colocar amount+=deposit que ja esta implementado em deposit()
	}

	public BankAccount(String name, int idAccount) {

		this.name = name;
		this.idAccount = idAccount;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getIdAccount() {
		return this.idAccount;
	}

	public void withdraw(double withdraw) {

		totalAmount -= withdraw+5.0;
	}

	public void deposit(double deposit) {
		totalAmount += deposit;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void info() {
		System.out.println("Name: "+getName()+" ID: "+getIdAccount()+" Total Amount: "+getTotalAmount());
	}
}

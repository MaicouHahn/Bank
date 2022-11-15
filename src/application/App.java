package application;

import java.util.Locale;

import entities.BankAccount;

public class App {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		BankAccount account = new BankAccount("Maicou", 12345);
		
		account.info();
		
		account.deposit(500.00);
		
		account.info();
		account.setName("Roberto");
		account.withdraw(550.00);
		account.info();

		
	}
}

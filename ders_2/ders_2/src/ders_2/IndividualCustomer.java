package ders_2;

public class IndividualCustomer extends Customer {

	private String firstName;
	private String lastName;
	private int credidtScore;
	private int balance;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCredidtScore() {
		return credidtScore;
	}

	public void setCredidtScore(int credidtScore) {
		this.credidtScore = credidtScore;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

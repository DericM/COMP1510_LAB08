package account;

//************************************************************ 
// Account.java 
//
//A bank account class with methods to deposit to, withdraw from, 
// change the name on, and get a String representation 
// of the account.
//************************************************************

import java.util.Random;

public class Account {
    
    public static int numAccounts;
    
    private double balance; 
    private String name; 
    private long acctNum;
    
    private Random rand = new Random();
    //------------------------------------------------
    //Constructor -- initializes balance, owner, and account number 
    //------------------------------------------------
    public Account(double initBal, String owner, long number) {
        numAccounts++;
        balance = initBal; 
        name = owner; 
        acctNum = number;
    }
    public Account (double initBal, String owner){
        numAccounts++;
        balance = initBal; 
        name = owner; 
        acctNum = generateNum();
    }
    public Account ( String owner){
        numAccounts++;
        balance = 0;
        name = owner; 
        acctNum = generateNum();
    }
    
    public void close(){
    	balance = 0;
    	name += " CLOSED";
    	numAccounts--;
    }
    
    public static Account consolidate(Account acct1, Account acct2){
    	if(!acct1.getName().equalsIgnoreCase(acct2.getName())){
    		System.out.println("You cannot consolodate accounts with different names.");
    		return null;
    	}
    	if(acct1.getAcctNum() == acct2.getAcctNum()){
    		System.out.println("You cannot consolodate accounts with iddentical numbers.");
    		return null;
    	}
    	Account acct3 = new Account(acct1.getBalance() + acct2.getBalance(), acct1.getName());
    	acct1.close();
    	acct2.close();
    	
    	return acct3;
    }
    
    public long generateNum(){
        long r = rand.nextLong();
        return (r < 0)? r * -1: r;
    }
    
    //------------------------------------------------
    // Checks to see if balance is sufficient for withdrawal. 
    // If so, decrements balance by amount; if not, prints message. 
    //------------------------------------------------
    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient funds"); 
    }
    public void withdraw(double amount, double fee) {
        if (balance >= (amount + fee)) balance -= (amount + fee);
        else System.out.println("Insufficient funds"); 
    }
    //------------------------------------------------
    // Adds deposit amount to balance.
    //-------------------------------------------------
    public void deposit(double amount) {
        balance += amount; 
    }
    //------------------------------------------------
    // Returns balance.
    //------------------------------------------------
    public double getBalance() {
        return balance; 
    }
    //------------------------------------------------
    // Returns a string containing the name, account number, and balance. 
    //------------------------------------------------
    public String toString() {
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: " + balance;
    } 
    
    public String getName(){
    	return name;
    }
    
    public long getAcctNum(){
    	return acctNum;
    }
   
    
    public static int getNumAccounts(){
        return numAccounts;
    }
    
}









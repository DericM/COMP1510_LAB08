package q3;

import java.util.Scanner;
import account.Account;

public class TestAccounts2 {
    public static void main(String[] args) {
        Account testAcct1; 
        Account testAcct2; 
        Account testAcct3;
        Account testAcct4;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Name1: "); 
        testAcct1 = new Account(100, scan.next()); 
        
        System.out.print("Enter Name2: "); 
        testAcct2 = new Account(100, scan.next()); 
        
        System.out.print("Enter Name3: "); 
        testAcct3 = new Account(100, scan.next()); 
        System.out.println(); 
        
        System.out.println("Account1: " + testAcct1 + "\n");
        System.out.println("Account2: " + testAcct2 + "\n");
        System.out.println("Account3: " + testAcct3 + "\n");
        
        testAcct1.close();
        testAcct4 = Account.consolidate(testAcct2,testAcct3);
        
        System.out.println("Account1: " + testAcct1 + "\n");
        System.out.println("Account2: " + testAcct2 + "\n");
        System.out.println("Account3: " + testAcct3 + "\n");
        System.out.println("Consolidated Account: " + testAcct4);
    }
}
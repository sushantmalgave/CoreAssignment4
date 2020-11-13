
//3) WAP to define a class Bank accept customerid, name, balance
//   write method to perform deposit, checkbal, withdraw keep min. balance 1000.

import java.util.*;
class Bank
{
    private int customerid;
    private String name;
    private static int balance;
    Scanner s1=new Scanner(System.in);
    
    Bank()
    {
        System.out.print("Enter Customer ID: ");
        customerid=s1.nextInt();
        
        System.out.print("Enter Name: ");
        s1.nextLine();
        name=s1.nextLine();
        }
    
    void deposit()
    {
        System.out.print("Enter Amount to Deposit: ");
        int a=s1.nextInt();
        
        
        if(a<1000)
        {
            System.out.println("Minimum balance should be Rs.1000");
        }
        else
        {
            balance=balance+a;
            System.out.println("Rs."+a+" is successfully deposited");
        }
    }
    
    void checkbal()
    {
        System.out.println("Your account balance is: Rs."+balance);
    }
    
    void withdraw()
    {
        System.out.print("Enter Amount to Debit: ");
        int x=s1.nextInt();
        if(balance-x>=1000)
        {
            balance=balance-x;
            System.out.println("Transaction Successful & balance is Rs."+balance);
        }
        else
            System.out.println("Withdrawl not allowed. (Minimum balance Rs.1000 required)");
    }
}
    
class Que_3
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        Bank obj=new Bank();
        obj.deposit();
        obj.checkbal();
        obj.withdraw();        
    }
}



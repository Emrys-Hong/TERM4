// ATTENTION 
// just edit this file
// TestAccount.java contains the test cases provided in the problem set 
// Put in any import statements that you need 


import java.util.Date;

// ATTENTION 
// just edit this file
// TestAccount.java contains the test cases provided in the problem set 
// Put in any import statements that you need 


public class Account{

    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();

    //constructor

    public Account() {
    }

    public Account(int startId, double startBalance) {
        id = startId; // should have "this" or not ?
        balance = startBalance;
    }

    // accessor
    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }


    // mutator
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    // get interest rate
    public static double getMonthlyInterestRate() {
        return Account.annualInterestRate/12;
    }

    // get monthly interest
    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate()/100;
    }

    // withdraw
    public void withdraw(double money) {
        this.balance -= money;
    }

    // deposit
    public void deposit(double money) {
        this.balance += money;
    }
}

// yy ans:

public class Account{
     //data field
     private int id=0;
     private double balance=0;
     private static double annualInterestRate=0;
     private Date dateCreated=new Date();
     
    //constructorwith no arg and with arg
     Account(){
     }
     Account(int newid,double newbal){
         id=newid;
         balance=newbal;
     }
  
        //accessor:getter;mutator:setter ofr id balance,annual insterest
     void setid(int newid){
         id=newid;
     }   
     int getid(){
         return id;
     }
     void setbalance(double newbal){
         balance=newbal;
     }
     double getBalance(){
        return balance;
    }
     Date getdateCreated(){
         return dateCreated;
     } 
     static void setAnnualInterestRate(double newannualInterestRate){
        annualInterestRate=newannualInterestRate;
    }
    static double getAnnualInterestRate(){
        return annualInterestRate;
    }
     
    //method 
     double getMonthlyInterestRate(){
         return annualInterestRate/12;

     }
     double getMonthlyInterest(){
         return balance*getMonthlyInterestRate()*0.01;
     }
     void withdraw(double amount){
         balance-=amount;
     }
     void deposit(double amount){
         balance+=amount;
     }

 } 

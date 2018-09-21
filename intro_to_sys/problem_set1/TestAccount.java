import java.util.Date;
class CheckingAccount extends Account{
   
    CheckingAccount(int id,double balance){
        this.id=id;
        this.balance=balance;
    };
    void withdraw(double amount){
        double current=getBalance()-amount;
        if(current<-5000){
            System.out.println("over limit");
            
        }else{setbalance(current);}
        }
    }        
public class TestAccount {

	public static void main(String[] args) {

		CheckingAccount myCheckAcc = new CheckingAccount(1024, 8000.0);
		myCheckAcc.deposit(2000);
		myCheckAcc.withdraw(15000);

		System.out.println(myCheckAcc.getBalance());
		myCheckAcc.withdraw(200);
		System.out.println(myCheckAcc.getBalance());	
		myCheckAcc.deposit(7000);
		myCheckAcc.withdraw(200);
		System.out.println(myCheckAcc.getBalance());		
	}

}
// ATTENTION 
// just edit this file
// TestAccount.java contains the test cases provided in the problem set 
// Put in any import statements that you need 


class Account{
     
      int id=0;
      double balance=0;
      static double annualInterestRate=0;
      Date dateCreated=new Date();
     
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


public class Account {
    private double balance = 0;
    
    public Account(double balance) {
         this.balance = balance;
    
    }

    public double getBalance() {

        return balance;
        
        }

    public void deposit(double amount) {
    //Implementation here\
    balance = balance + amount;
    }
    
    public void withdraw(double amount) {
    //Implementation here
    if(balance >= amount){
        balance = balance - amount;
        }
    else
    System.out.println("Error, trhere was a prtoblem");
    
    }
    }
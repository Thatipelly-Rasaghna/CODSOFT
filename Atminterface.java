
import java.util.*;
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposit balance.new balance"+balance);
        }else{
            System.out.println("invalid deposit");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Deposit balance.new balance"+balance);
        }else{
            System.out.println("invalid amount");
        }
    }
}
class Atm{
    private BankAccount account;
    private Scanner s;
    public Atm(BankAccount account ){
        this.account=account;
        this.s=new Scanner(System.in);
        
    }
    public void show(){
        System.out.println("1.check balance");
System.out.println("2.deposit");
System.out.println("3.withdraw");
System.out.println("4.exit");
    }
    public void run(){
        int choice;
        do{
            show();
            System.out.println("Enter your choice");
            choice=s.nextInt();
            switch(choice){
                case 1:
                    checkBalance();
                    break;
               case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                 case 4:
                    System.out.println("Thank you for using ATM");
                    break;
                default:
                System.out.println("invalid choice");
                
            }
        }
        while(choice!=4);
    }
    private void checkBalance(){
        System.out.println("your current Balance" +account.getBalance());
    }
    private void deposit(){
        System.out.println("Enter your deposit amount");
        double amount=s.nextDouble();
        account.deposit(amount);
    }
    private void withdraw(){
        System.out.println("Enter your with draw amount");
        double amount=s.nextDouble();
        account.withdraw(amount);
    }
}
public class Atminterface{
    public static void main(String args[]){
        System.out.println("welcome to atm");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 4 digit pin");
        int enterpin=sc.nextInt();
        BankAccount userAccount=new BankAccount(1000.0);
        Atm atm=new Atm(userAccount);
        atm.run();
    }
}

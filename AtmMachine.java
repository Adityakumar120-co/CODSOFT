import java.util.Scanner;

class BankAccount 
   {
    private double balance;
 
    public BankAccount(double AccountBalance)
   {
    this.balance = AccountBalance;
   }
    //this method will help the user to deposit money

    public void deposit(double amount)
   {
    if(amount>0){
    balance += amount;//increase the balance by adding the deposited amount 
    System.out.println("Amount is successfully deposited : " + amount);
   }else{
    System.out.println("Deposit amount must be positive ");
   }
   }
 // this method will help to withdraw the money

public boolean withdrawal(double amount ){
if(amount > 0 && amount<=balance){
 balance-= amount;
 System.out.println("Successfully withdrawal :" + amount);
return true;
}else if (amount>balance){
System.out.println("Insufficient amount can't make any withdrawal");
}else{
System.out.println("The withdrawal amount is not a positive amount");
}
return false;
}


// this method will help to check the account balance
 
public double showBalance(){
return balance;
}
   }
//Atm interface
class Atm
{
//this class is private but acccesesable by using constructor
private BankAccount account;
//contructor
public Atm(BankAccount account){
this.account = account;
}
//method to start the process of atm machine
public void start(){
Scanner input = new Scanner(System.in);
boolean exit = false;
//this loop will terminate when the user choose exit option.
while(!exit){
System.out.println("****Welcome to the Atm****");
System.out.println("01.DEPOSIT MONEY\n");
System.out.println("02.CHECK BALANCE\n");
System.out.println("03.WITHDRAW MONEY\n");
System.out.println("04.EXIT\n");
System.out.println("CHOOSE THE OPTION FROM THE ABOVE");
int wantToDo = input.nextInt();

switch (wantToDo){
case 1:
System.out.println("Enter the amount of deposit:");
double depositAmount = input.nextDouble();
account.deposit(depositAmount);
break;
case 2:
System.out.println("Your balance is:" + account.showBalance());
break;
case 3:
System.out.println("Enter the amount of withdrawal:");
double withDrawAmount = input.nextDouble();
account.withdrawal(withDrawAmount);
break;
case 4:
exit = true;
System.out.println("Thanks for using our service.");
break;
default:
System.out.println("Please enter the correct option number from the above");
}
}
input.close();
}
}
  
public class AtmMachine{
public static void main(String[]args){
BankAccount account = new BankAccount(979);
Atm atm = new Atm(account);
atm.start();//starting the atm
    //thanks for using this program
 }
}

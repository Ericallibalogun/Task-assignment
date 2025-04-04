package GateOne;

public class Account {
    public String getFirstName;
    private String firstName;
    private String lastName;
    private double balance;
    private int pinCode;


    public Account(String firstName, String lastName,int pinCode) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = 0.0;
    this.pinCode = pinCode;
    }

   public String getFirstName() {
        return firstName;
   }
   public String getLastName() {
     return lastName;
   }
   public double getBalance(){
        return balance;
   }
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount);
        }else{
            System.out.println("Invalid amount to deposit");
        }
    }
    public void withdraw(double amount, int pinCode) {
        if(pinCode != this.pinCode) {
            System.out.println("Invalid pin");
        }
        if(amount <= 0){
            System.out.println("Invalid amount");
        }
        if(amount <= 50.00){
            System.out.println("Withdrawal unsuccessful,Amount must be greater than 50.00");
        }
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        balance -= amount;
    }

}
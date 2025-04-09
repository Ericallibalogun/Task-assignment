package GateOne;
public class BankApp{
    private String firstName;
    private String lastName;
    private int pin;
    private double balance = 0.0;

    public BankApp(String firstName, String lastName, int pin) {
        if(firstName.matches("[a-zA-Z]+")){
            this.firstName = firstName;
        }else throw new IllegalArgumentException("firstName must contain only letters");

        if(lastName.matches("[a-zA-Z]+")){
            this.lastName = lastName;
        }else throw new IllegalArgumentException("lastName must contain only letters");

        if(pin >= 1000 && pin <= 9999){
            this.pin = pin;
        }else {
            throw new IllegalArgumentException("pin must be 4 digits");
        }


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPin(int pin) {
    }

    public int getPin() {
        return pin;
    }
    public void deposit(int pin, double amount) {
        if(amount > 50.00){
            this.pin = pin;
            this.balance += amount;
        }else throw new IllegalArgumentException("Deposit amount must be grater than 50.00");
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(int pin, double amount) {
        if(amount >= 50.00){
            this.pin = pin;
            this.balance -= amount;
        }else throw new IllegalArgumentException("Withdrawal amount must be 50.00 @ minimum");
    }
}
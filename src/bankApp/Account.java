package bankApp;

public class Account {

    private int balance;
    private String pinCode;
    private String name;
    private String account;

    public Account(String firstName, String lastName, String accountNumber, String pinCode){
        this.name = firstName + " " + lastName;
        this.account = accountNumber;
        setPin(pinCode);
    }

    public int getBalance() {

        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int cash) {
        if (cash > 0) {
            balance = balance + cash;
        }
    }

    public void withdrawal(int cash, String pinCode){
     validatePin(pinCode);
     if (cash > 0 && balance >= cash){
         balance -= cash;
     } else if (cash > 0 && balance < cash) {
         throw new IllegalArgumentException("Ole!! You can not withdraw more than your balance");

     }

    }

    public void setPin(String pinCode) {
        if(pinCode == null){
            throw  new IllegalArgumentException("Pin cannot be null");
        } else if (pinCode.length() != 4) {
            throw  new IllegalArgumentException("Pin must be exactly 4 digit");
            
        }
        for(int count = 0; count < pinCode.length(); count ++){
            if(!Character.isDigit(pinCode.charAt(count))){
                throw new IllegalArgumentException("Pin must contain only numbers");
            }

        }

        this.pinCode = pinCode;
    }

    public String getPin(){
        return pinCode;
    }

    public void validatePin(String pinCode){
        if(this.pinCode == null){
            throw new IllegalArgumentException("No pin has been set entered yet");
        } else if (!this.pinCode.equals(pinCode)) {
            throw new IllegalArgumentException("Invalid pin code");

        }

    }
}
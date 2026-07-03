package bankApp;

public class Account {

    private int balance;
    private String pinCode;

    public int getBalance() {
        return balance;
    }

    public void deposit(int cash) {
        if (cash > 0) {
            balance = balance + cash;
        }
    }

    public void withdrawal(int cash, String pinCode){
        if(cash > 0 && balance >= cash && this.pinCode.equals(pinCode)){
            balance = balance - cash;

        }
        System.out.println("Invalid Pin, Please enter your valid pin code");
    }

    public void setPin(String pinCode) {
        this.pinCode = pinCode;
    }
}
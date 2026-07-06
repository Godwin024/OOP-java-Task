package bankApp;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts;

    public Bank(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }
    public int getNumberOfAccounts() {
        return accounts.size();
    }
}

package com.example.interview.blackRock.bank;

import java.text.MessageFormat;
import java.util.*;

public class Solution {
    private static final String TEXT =  "I am a {0} account with {1,number,#} units of {2} currency";

    public static void main(String args[] ) throws Exception {

        List<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new SavingsAccount("USD",3));//Savings
        accounts.add(new SavingsAccount("EUR",2));//Savings
        accounts.add(new CheckingAccount("HUF",100));//Checking
        accounts.add(new CheckingAccount("COP",10000));//Checking
        accounts.add(new BrokerageAccount("GBP",2));//Brokerage
        accounts.add(new BrokerageAccount("INR",600));//Brokerage

        accounts.stream().forEach(
                account -> System.out.println(
                        MessageFormat.format(TEXT,
                                new Object[]{
                                        account.getAccountType().getName(),//make this work
                                        account.getUnits(),//make this work
                                        account.getCurrency()//make this work
                                })));
    }
}

class AccountType {
    private String name;

    public AccountType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class BankAccount {
    private AccountType accountType;
    private String currency;
    private long units;

    public BankAccount(String accountTypeName, String currency, long units){
        this.accountType=new AccountType(accountTypeName);
        this.currency = currency;
        this.units = units;
    }

    public String getCurrency() {
        return currency;
    }


    public long getUnits() {
        return units;
    }


    public AccountType getAccountType() {
        return accountType;
    }

}

class SavingsAccount extends BankAccount{
    public SavingsAccount(String cur,long amt){
        super("Savings", cur, amt );
    }
}

class CheckingAccount extends BankAccount{
    public CheckingAccount(String cur,long amt){
        super("Checking", cur, amt );
    }
}

class BrokerageAccount extends BankAccount{
    public BrokerageAccount(String cur,long amt){
        super("Brokerage", cur, amt );
    }
}
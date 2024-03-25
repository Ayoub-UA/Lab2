package com.example.lab2.Server;






public class Account {
    private double balance;
    private static int idCounter=0;
    private final int id;
    public Account()
    {
        id=idCounter;
        idCounter++;
        balance=0;
    }



    public void add(double toBeAdded)
    {
        if(toBeAdded<=0) {throw new IllegalArgumentException("You can only add a strictly positive amount of money");}
        balance+=toBeAdded;
    }


    public void remove( double toBeRemoved)
    {
        if(toBeRemoved<=0 || toBeRemoved>balance)  {throw new IllegalArgumentException("You can only add a strictly positive amount of money that's at most "+balance);}
        balance-=toBeRemoved;
    }


    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }
}

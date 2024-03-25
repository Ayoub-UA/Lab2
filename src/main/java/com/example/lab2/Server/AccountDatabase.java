package com.example.lab2.Server;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class AccountDatabase {
    private ArrayList<Account> accountList;

    public AccountDatabase() {
        this.accountList = new ArrayList<>();
    }

    public void addAccount(Account account)
    {
        accountList.add(account);
    }

    public Account search(int id)
    {
        for(Account ac:accountList)
        {
            if(ac.getId()==id)
            {return ac;}
        }

        return null;
    }

}

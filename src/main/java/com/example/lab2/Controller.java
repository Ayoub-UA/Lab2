package com.example.lab2;

import com.example.lab2.Server.Account;
import com.example.lab2.Server.AccountDatabase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private final AccountDatabase ab;

    public Controller()
    {
        ab=new AccountDatabase();
    }


    @PostMapping("/Accounts")
    public ResponseEntity<Integer> addAccount()
    {
        Account p=new Account();
        ab.addAccount(p);
        return ResponseEntity.status(HttpStatus.CREATED).body(p.getId());
    }

    @PutMapping("Accounts/{id}/addtobalance")
    public void addMoney(@PathVariable int id, @RequestBody double toBeAdded)
    {
        ab.search(id).add(toBeAdded);
    }

    @PutMapping("Accounts/{id}/takefrombalance")
    public void takeMoney(@PathVariable int id, @RequestBody double toBeRemoved)
    {
        ab.search(id).remove(toBeRemoved);
    }

    @GetMapping("/Accounts/{id}")
    public double getBalance(@PathVariable int id)
    {
        return ab.search(id).getBalance();
    }

}

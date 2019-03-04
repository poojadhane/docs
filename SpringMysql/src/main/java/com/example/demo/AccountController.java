package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AccountController 
{
	@Autowired
	AccountRepository accountRepository;
	
	@GetMapping("/accounts")
	public void create(@RequestBody Account account)
	{
		accountRepository.save(account);
	}
	
	@GetMapping("/accounts")
	public Iterable<Account> getAll()
	{
		return accountRepository.findAll();
	}
	
}

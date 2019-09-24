package com.kata.bankAccount.business;

import java.util.List;

import com.kata.bankAccount.model.Account;
import com.kata.bankAccount.model.Operation;

public interface IAccountBusiness {
	
	public void saveMoney(Account account, Double amount);
	
	public void retriveMoney(Account account, Double amount);
	
	public List<Operation> checkOperations(Account account);

}

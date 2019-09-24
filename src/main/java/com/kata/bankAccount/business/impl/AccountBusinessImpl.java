package com.kata.bankAccount.business.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.kata.bankAccount.business.IAccountBusiness;
import com.kata.bankAccount.model.Account;
import com.kata.bankAccount.model.Operation;
import com.kata.bankAccount.model.OperationType;

public class AccountBusinessImpl implements IAccountBusiness {

	public void saveMoney(Account account, Double amount) {
		Operation operation = new Operation();
		operation.setAmount(amount);
		operation.setType(OperationType.DEPOSIT);
		operation.setDate(LocalDateTime.now());
		account.getOperations().add(operation);
		
	}

	public void retriveMoney(Account account, Double amount) {
		Operation operation = new Operation();
		operation.setAmount(amount*-1);
		operation.setType(OperationType.WITHDRAWAL);
		operation.setDate(LocalDateTime.now());
		account.getOperations().add(operation);
		
	}

	public List<Operation> checkOperations(Account account) {
		return account.getOperations();
	}


}

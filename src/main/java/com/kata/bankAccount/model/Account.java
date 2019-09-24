package com.kata.bankAccount.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {
	
	private List<Operation> operations;
	
	public Account() {
		operations = new ArrayList<Operation>();
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	@Override
	public String toString() {
		Collections.sort(this.operations);
		StringBuilder sb = new StringBuilder();
		this.operations.stream().forEach(o -> sb.append(o.toString()).append("\n"));
		Double balance = new Double(0);
		for(Operation o : this.operations){
			balance += o.getAmount();
		}
		sb.append("\n").append("Balance : ").append(balance);
		return sb.toString();
	}
	
	
	
}

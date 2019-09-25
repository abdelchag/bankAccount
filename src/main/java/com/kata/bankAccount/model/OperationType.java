package com.kata.bankAccount.model;

public enum OperationType {
	
	DEPOSIT("Deposit"),
	WITHDRAWAL("Withdrawal");
	
	private String valeur;
	
	private OperationType(String valeur){
		this.valeur = valeur;
	}

	public String getValeur(){
		return this.valeur;
	}
	
}

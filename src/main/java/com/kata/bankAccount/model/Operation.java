package com.kata.bankAccount.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operation implements Comparable<Operation> {
	
	private OperationType type;
	
	private Double amount;
	
	private LocalDateTime date;

	public OperationType getType() {
		return type;
	}

	public void setType(OperationType type) {
		this.type = type;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public int compareTo(Operation o) {
		return this.date.compareTo(o.date);
	}

	@Override
	public String toString() {
		final DateTimeFormatter PATTERN = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");	
		StringBuilder sb = new StringBuilder();
		sb.append("type : ").append(type).append("\t").append("amount : ").append(amount).append("\t").append("date : ").append(this.date.format(PATTERN));
		return sb.toString();
	}
	
	
	
	

}

package com.kata.bankAccount.helper;

import java.util.Scanner;

import com.kata.bankAccount.business.IAccountBusiness;
import com.kata.bankAccount.business.impl.AccountBusinessImpl;
import com.kata.bankAccount.model.Account;

public class AccountHelper {

	private static IAccountBusiness accountBusiness;

	private static Scanner scanner;

	static {
		AccountHelper.accountBusiness = new AccountBusinessImpl();
		AccountHelper.scanner = new Scanner(System.in);
	}

	public static void saveMoney(Account account) {
		System.out.print("Please tape the amount : ");
		Double amount = AccountHelper.scanner.nextDouble();
		AccountHelper.accountBusiness.saveMoney(account, amount);
	}

	public static void retriveMoney(Account account) {
		System.out.print("Please tape the amount : ");
		Double amount = AccountHelper.scanner.nextDouble();
		AccountHelper.accountBusiness.retriveMoney(account, amount);
	}

	public static String checkOperations(Account account) {
		return account.toString();
	}

}

package com.kata.bankAccount;

import java.util.Scanner;

import com.kata.bankAccount.helper.AccountHelper;
import com.kata.bankAccount.model.Account;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		String choice = "";
		Account account = new Account();
		while (!choice.equals("4")) {
			System.out.println("Please make your choice");
			System.out.println("1 - Save money");
			System.out.println("2 - Retreive money");
			System.out.println("3 - Check operations");
			System.out.println("4 - Exit");
			System.out.print("Your choice :");
			choice = new Scanner(System.in).next();
			switch (choice) {
			case "1":
				AccountHelper.saveMoney(account);
				System.out.println("Operation done");
				break;

			case "2":
				AccountHelper.retriveMoney(account);
				System.out.println("Operation done");
				break;

			case "3":
				String accountDetail = AccountHelper.checkOperations(account);
				System.out.println(accountDetail);
				break;

			case "4":
				System.out.println("EXIT");

			default:
				break;
			}

		}

	}
}

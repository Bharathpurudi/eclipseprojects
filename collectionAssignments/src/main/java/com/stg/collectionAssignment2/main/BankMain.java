package com.stg.collectionAssignment2.main;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

import com.stg.collectionAssignment2.model.Bank;
import com.stg.collectionAssignment2.service.*;

public class BankMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			Bank accountHolder1 = new Bank(456456564, "Bharath", 1250);
			Bank accountHolder2 = new Bank(456586568, "Bittu", 500);
			Bank accountHolder3 = new Bank(258764257, "Chinna", 400);
			Bank accountHolder4 = new Bank(876986232, "Jyothirmai", 56456);
			Bank accountHolder5 = new Bank(568624274, "Chinni", 150);
			Bank accountHolder6 = new Bank(953357253, "Jyo", 1500);

			Set<Bank> accountHolders = new HashSet<Bank>();
			accountHolders.add(accountHolder1);
			accountHolders.add(accountHolder2);
			accountHolders.add(accountHolder3);
			accountHolders.add(accountHolder4);
			accountHolders.add(accountHolder5);
			accountHolders.add(accountHolder6);
			BankServiceImpl bankServiceImpl = new BankServiceImpl();
			System.out.println("Enter the threshold value amount: ");
			int thresholdAmount = input.nextInt();
			Set<Bank> lessBalHolders = bankServiceImpl.lessAmountHolders(accountHolders, thresholdAmount);
			if (lessBalHolders.size() != 0) {
				for (Iterator<Bank> iterator = lessBalHolders.iterator(); iterator.hasNext();) {
					Bank accountHolder = (Bank) iterator.next();
					System.out.println("The account NO: " + accountHolder.getAccountNum() + " and account holder name is "
							+ accountHolder.getAccountHolderName());

				}
			}else {
				System.out.println("No Account holders with less than Rs:1000");
			}

			Set<Bank> nonWidthdrawlHolders = bankServiceImpl.amountWithdrawl(accountHolders);
			if(nonWidthdrawlHolders.size()!=0) {
				for (Bank bank : nonWidthdrawlHolders) {
					System.out.println("Withdwarl denied due to minimum balance constraint. Your Acc Bal is: " + bank.getAccountBalance());

				}
			}else {
				System.out.println("No Account holders with less than Minimum balance");
			}
		} finally {
			input.close();
		}
	}

}

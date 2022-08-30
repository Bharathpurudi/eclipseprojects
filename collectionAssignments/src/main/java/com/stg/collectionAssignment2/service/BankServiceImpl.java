package com.stg.collectionAssignment2.service;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

import com.stg.collectionAssignment2.model.Bank;

public class BankServiceImpl implements BankService {

	@Override
	public Set<Bank> lessAmountHolders(Set<Bank> accountHoldersList, int thresholdAmount) {
		Set<Bank> tempList = new HashSet<Bank>();
		for (Bank bank : accountHoldersList) {
			if (Integer.compare(bank.getAccountBalance(), thresholdAmount) < 0) {
				tempList.add(bank);
			}

		}
		return tempList;

	}

	@Override
	public Set<Bank> amountWithdrawl(Set<Bank> accountHoldersList) {
		Set<Bank> tempList = new HashSet<Bank>();
		for (Bank bank : accountHoldersList) {
			if (Integer.compare(bank.getAccountBalance(), 500) < 0) {
				tempList.add(bank);
			}

		}
		return tempList;
	}

}

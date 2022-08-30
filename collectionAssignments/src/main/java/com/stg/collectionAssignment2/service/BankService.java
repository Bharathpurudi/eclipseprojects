package com.stg.collectionAssignment2.service;

import java.util.Set;

import com.stg.collectionAssignment2.model.Bank;

public interface BankService {
	public abstract Set<Bank> lessAmountHolders(Set<Bank> accountHoldersList, int thresholdAmount);

	public abstract Set<Bank> amountWithdrawl(Set<Bank> accountHoldersList);
}

package org.capgemini.service;

import java.util.List;

import org.capgemini.pojo.Account;

public interface AccountService {
	
	public void saveAccount(Account account);
	public List<Account> getAllAccounts() ;
	public void deleteAcount(Integer accountNumber);
}

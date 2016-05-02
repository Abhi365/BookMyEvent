package org.capgemini.dao;

import java.util.List;

import org.capgemini.pojo.Account;

public interface AccountDao {
	
	public void saveAccount(Account account);
	
	public List<Account> getAllAccounts();
	
	public void deleteAcount(Integer accountNumber);

}

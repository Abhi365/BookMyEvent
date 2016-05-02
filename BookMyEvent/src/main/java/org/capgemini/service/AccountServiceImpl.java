package org.capgemini.service;

import java.util.List;

import org.capgemini.dao.AccountDao;
import org.capgemini.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	private AccountDao accountDao;

	@Transactional
	public void saveAccount(Account account) {
		accountDao.saveAccount(account);
		
	}

	@Transactional
	public List<Account> getAllAccounts() {
		return accountDao.getAllAccounts();
	}

	@Transactional
	public void deleteAcount(Integer accountNumber) {
		accountDao.deleteAcount(accountNumber);
		
	}

}

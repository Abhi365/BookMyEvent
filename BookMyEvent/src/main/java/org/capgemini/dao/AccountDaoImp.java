package org.capgemini.dao;


import java.util.List;
import org.capgemini.pojo.Account;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;



@Repository
public class AccountDaoImp implements AccountDao{
	
	@Autowired
	private SessionFactory sessionFactory;

 NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Override
	public void saveAccount(Account account) {
		sessionFactory.getCurrentSession().save(account);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAllAccounts() {
		
		return sessionFactory.getCurrentSession().createQuery("from Account").list();
	}

	@Override
	public void deleteAcount(Integer accountNumber) {
		Account account=(Account) sessionFactory.getCurrentSession().get(Account.class, accountNumber);
		if(account!=null)
			sessionFactory.getCurrentSession().delete(account);
	}

}

package org.capgemini.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Account {
	
	@Id
	private int accountNo;
	
	@NotEmpty(message="* Please enter AccountName.")
	private String accountName;
	private String accountType;
	
	private Date openDate;
	private double amount;
	private Date accountDob;
	private String gender;
	
	public Account(){}
	
	public Account(int accountNo, String accountName, String accountType, Date openDate, double amount, Date accountDob,
			String gender) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountType = accountType;
		this.openDate = openDate;
		this.amount = amount;
		this.accountDob = accountDob;
		this.gender = gender;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getAccountDob() {
		return accountDob;
	}
	public void setAccountDob(Date accountDob) {
		this.accountDob = accountDob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountName=" + accountName + ", accountType=" + accountType
				+ ", openDate=" + openDate + ", amount=" + amount + ", accountDob=" + accountDob + ", gender=" + gender
				+ "]";
	}
	
	
	
	
}

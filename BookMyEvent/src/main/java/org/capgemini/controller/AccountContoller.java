package org.capgemini.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.capgemini.pojo.Account;
import org.capgemini.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AccountContoller {
	
	@Autowired
	private AccountService accountService;

	@RequestMapping("/account")
	public String showAccountPage(Map<String, Object> map){
		
				map.put( "account", new Account());
				map.put("acctype", getAllAccountType().values());
				map.put("accounts", accountService.getAllAccounts());
				
				return "accountRegister";
	}
	
	@RequestMapping(value="/saveAccount",method=RequestMethod.POST)
	public ModelAndView saveAccount(@Valid @ModelAttribute("account") Account account,
			BindingResult result){
		
		if(!result.hasErrors()){
			System.out.println(account);
			accountService.saveAccount(account);
			return new ModelAndView("redirect:account","acctype", getAllAccountType().values());
		}else
		{
			return new ModelAndView("accountRegister","acctype", getAllAccountType().values());
		}
	
	}
	
	
	
	@RequestMapping("/delete/{accountNum}")
	public String deleteAccount(@PathVariable("accountNum") Integer accNum){
		accountService.deleteAcount(accNum);
		return "redirect:/account";
	}
	
	
	
	
	
	
	
	
	
	
	public Map<Integer, String> getAllAccountType(){
		
		Map<Integer, String> maps=new HashMap<>();
		
		maps.put(1,"Savings");
		maps.put(2,"Current");
		maps.put(3,"Loan");
		maps.put(4,"RD");
		maps.put(5,"FD");
		
		return maps;
		
	}
	
}

package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.impl.AccountDAOImpl;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.service.AccountService;

public class AccountServiceImpl implements AccountService{
	public static AccountServiceImpl getInstance() {
		return new AccountServiceImpl();
	}
	public AccountServiceImpl() {}
	@Override
	public ResultMap selectAccount() {
		return AccountDAOImpl.getInstance().selectAccountByID();
	}
	@Override
	public void openAccount(Command cmd) {
		
	}
	@Override
	public ResultMap findAccountById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}
}

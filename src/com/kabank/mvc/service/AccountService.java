package com.kabank.mvc.service;

import com.kabank.mvc.command.Command;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AccountBean;

public interface AccountService {
	public void openAccount(Command cmd);
	public ResultMap findAccountById(Command cmd);
	public ResultMap selectAccount();
}

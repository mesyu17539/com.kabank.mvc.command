package com.kabank.mvc.service;

import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.domain.AccountBean;
import com.kabank.mvc.domain.TelecomBean;

public interface MobileService {
	public String create();
	public ResultMap selectMobile();
}

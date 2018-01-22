package com.kabank.mvc.dao.impl;

import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.MobileDAO;
import com.kabank.mvc.decorate.ExcuteQuery;
import com.kabank.mvc.domain.TelecomBean;
import com.kabank.mvc.query.member.CreateMobileQuery;
import com.kabank.mvc.query.member.LoginMQuery;

public class MobileDAOImpl implements MobileDAO{
	public static MobileDAOImpl getInstance() {
		return new MobileDAOImpl();
	}
	private MobileDAOImpl() {}
	@Override
	public String joinMobile() {
		return (String) new ExcuteQuery(new CreateMobileQuery()).execute();
	}
	public ResultMap selectMobile() {
		// TODO Auto-generated method stub
		return (ResultMap)new ExcuteQuery(new LoginMQuery()).execute();
	}
}

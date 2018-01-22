package com.kabank.mvc.serviceImpl;

import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.CommonDAO;
import com.kabank.mvc.dao.impl.CommonDAOImpl;
import com.kabank.mvc.service.CommonService;

public class CommonServiceImpl implements CommonService{
	CommonDAO cDao;
	public CommonServiceImpl() {
		cDao=new CommonDAOImpl();
	}

	@Override
	public ResultMap callCount() {
		return cDao.selectTableCount();
	}
}

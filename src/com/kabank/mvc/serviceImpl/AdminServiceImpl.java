package com.kabank.mvc.serviceImpl;

import java.util.List;

import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.AdminDAO;
import com.kabank.mvc.dao.impl.AdminDAOImpl;
import com.kabank.mvc.service.AdminService;

public class AdminServiceImpl implements AdminService{
	AdminDAO adminDAO;

	public AdminServiceImpl() {
		adminDAO=new AdminDAOImpl();
	}
	@Override
	public ResultMap creatTable(String tname) {
		boolean bool=true;
		ResultMap list=adminDAO.selectTable();
		for(int i=0;i<list.getList().size();i++) {
			if(tname.equals(list.getList().get(i))) {
				bool=false;
			}
		}
		System.out.println(bool);
		if(bool) {
			adminDAO.createMembers(tname);
		}
		return null;
	}

}

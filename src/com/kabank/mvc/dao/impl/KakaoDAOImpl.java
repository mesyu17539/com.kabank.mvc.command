package com.kabank.mvc.dao.impl;

import java.sql.ResultSet;

import com.kabank.mvc.command.InitCommand;
import com.kabank.mvc.command.ResultMap;
import com.kabank.mvc.dao.KakaoDAO;
import com.kabank.mvc.enums.Vendor;
import com.kabank.mvc.factory.DatabaseFactory;
import com.kabank.mvc.util.Enums;
import com.kabank.mvc.util.MemberEnum;

public class KakaoDAOImpl implements KakaoDAO{
	public static KakaoDAOImpl getInstance() {
		return new KakaoDAOImpl();
	}
	private KakaoDAOImpl() {}
	@Override
	public ResultMap SelectNum(String num) {
		ResultSet set=null;
		ResultMap foo = null;
		System.out.println("KAOIMPL select :\n"+MemberEnum.SELECTNUM.toString()+"\n"+num);
		try {
			set=(DatabaseFactory.create(Vendor.ORACLE)
			.getConnection()
			.createStatement()
			.executeQuery(
			String.format(
				MemberEnum.SELECTNUM.toString(),num
						)));
			while(set.next()) {
				foo.setStr(set.getString("ACCOUNT_NUM"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("foo"+foo);
		return foo;
	}
	@Override
	public ResultMap aNumcreate() {
		System.out.println("KODAO 쿼리문"+
				String.format(
				MemberEnum.MEMJOIN.toString()
						,Enums.TABLE.BANK
						,InitCommand.cmd.getColum()
						,InitCommand.cmd.getData()));
		try {
			if(!InitCommand.cmd.getColum().equals("false")) {
				DatabaseFactory.create(Vendor.ORACLE)
				.getConnection()
				.createStatement()
				.executeUpdate(
						String.format(
								MemberEnum.MEMJOIN.toString()
								,Enums.TABLE.BANK
								,InitCommand.cmd.getColum()
								,InitCommand.cmd.getData()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}

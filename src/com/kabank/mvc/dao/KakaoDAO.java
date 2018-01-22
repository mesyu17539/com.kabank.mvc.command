package com.kabank.mvc.dao;

import java.sql.ResultSet;

import com.kabank.mvc.command.ResultMap;

public interface KakaoDAO {
	public ResultMap aNumcreate();
	public ResultMap SelectNum(String num);

}

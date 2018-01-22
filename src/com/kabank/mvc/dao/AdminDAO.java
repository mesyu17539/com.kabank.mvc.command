package com.kabank.mvc.dao;

import java.util.List;

import com.kabank.mvc.command.ResultMap;

public interface AdminDAO {
	public ResultMap createMembers(String tname);
	public ResultMap selectTable();
}
